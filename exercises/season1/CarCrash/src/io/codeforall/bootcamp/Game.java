package io.codeforall.bootcamp;

import io.codeforall.bootcamp.cars.Car;
import io.codeforall.bootcamp.cars.CarFactory;
import io.codeforall.bootcamp.cars.Fiat;
import io.codeforall.bootcamp.cars.Mustang;
import io.codeforall.bootcamp.field.Field;
import io.codeforall.bootcamp.field.Position;

import java.io.FileReader;

public class Game {

    public static final int MANUFACTURED_CARS = 20;

    /**
     * Container of Cars
     */
    private Car[] cars;

    /**
     * Animation delay
     */
    private int delay;
    boolean fiatTurn;

    public Game(int cols, int rows, int delay) {
        Field.init(cols, rows);
        this.delay = delay;
        this.fiatTurn = true;
    }

    /**
     * Creates a bunch of cars and randomly puts them in the field
     */
    public void init() {
        cars = new Car[MANUFACTURED_CARS];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = CarFactory.getNewCar();
        }
        Field.draw(cars);
    }

    /**
     * Starts the animation
     *
     * @throws InterruptedException
     */
    public void start() throws InterruptedException {

        while (true) {

            // Pause for a while
            Thread.sleep(delay);

            // Move all cars
            moveAllCars();

            // Update screen
            Field.draw(cars);

        }

    }

    private void moveAllCars() {
        int rand;

        for (Car car : cars) {
            if (car instanceof Mustang || (car instanceof Fiat && fiatTurn)) {
                int[] direction = new int[]{0, 0};
                rand = (int) (Math.random() * 4);
                if (!car.isCrashed()) {
                    switch (rand) {
                        case 0 ->
                            // down
                                direction[0] = 1;
                        case 1 ->
                            // right
                                direction[1] = 1;
                        case 2 ->
                            // up
                                direction[0] = -1;
                        case 3 ->
                            // left
                                direction[1] = -1;
                    }
                    if (car.getPos().getCol() + direction[0] >= Field.getWidth() || car.getPos().getCol() + direction[0] < 0) {
                        direction[0] = -direction[0];
                    } else if (car.getPos().getRow() + direction[1] >= Field.getHeight() || car.getPos().getRow() + direction[1] < 0) {
                        direction[1] = -direction[1];
                    }
                    car.setPos(new Position(car.getPos().getCol() + direction[0], car.getPos().getRow() + direction[1]));
                }
            }
        }
        int[][] grid = new int[Field.getWidth()][Field.getHeight()];
        for (int i = 0; i < MANUFACTURED_CARS; i++) {
            Car car = cars[i];
            if (grid[car.getPos().getCol()][car.getPos().getRow()] != 0) {
                car.setCrashed();
                cars[grid[car.getPos().getCol()][car.getPos().getRow()]].setCrashed();
            } else {
                grid[car.getPos().getCol()][car.getPos().getRow()] = i;
            }
        }
        fiatTurn = !fiatTurn;
    }

}
