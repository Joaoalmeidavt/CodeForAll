package io.codeforall.bootcamp;

import io.codeforall.bootcamp.car.Car;
import io.codeforall.bootcamp.car.CarFactory;
import io.codeforall.bootcamp.grid.*;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

/**
 * The game logic
 */
public class Game implements KeyboardHandler {
    /**
     * Graphical Car field
     */
    private Grid grid;

    /**
     * Container of Cars
     */
    private Car[] cars;

    /**
     * Animation delay
     */
    private int delay;

    /**
     * The collision detector
     */
    private CollisionDetector collisionDetector;

    /**
     * Number of cars to manufacture
     */
    private int manufacturedCars = 20;
    private Keyboard keyboard;

    /**
     * Constructs a new game
     *
     * @param gridType which grid type to use
     * @param cols     number of columns in the grid
     * @param rows     number of rows in the grid
     * @param delay    animation delay
     */
    Game(GridType gridType, int cols, int rows, int delay) {

        grid = GridFactory.makeGrid(gridType, cols, rows);
        this.delay = delay;

    }

    /**
     * Creates a bunch of cars and randomly puts them in the field
     */
    public void init() {

        grid.init();

        cars = new Car[manufacturedCars + 1];
        collisionDetector = new CollisionDetector(cars);

        for (int i = 0; i < manufacturedCars + 1; i++) {

            cars[i] = CarFactory.getNewCar(grid);
            cars[i].setCollisionDetector(collisionDetector);
            cars[i].setGrid(grid);

        }
        cars[cars.length - 1].getPos().setColor(GridColor.MAGENTA);
    }

    /**
     * Starts the animation
     *
     * @throws InterruptedException
     */
    public void start() throws InterruptedException {

        initKeyboard();

        while (true) {

            // Pause for a while
            Thread.sleep(delay);

            moveAllCars();

        }

    }

    /**
     * Moves all cars
     */
    public void moveAllCars() {

        for (int i = 0; i < cars.length - 1; i++) {
            cars[i].move();
            collisionDetector.check(cars[i]);
        }

        collisionDetector.check(cars[cars.length - 1]);

    }

    private void initKeyboard() {
        this.keyboard = new Keyboard(this);

        KeyboardEvent moveRight = new KeyboardEvent();
        moveRight.setKey(KeyboardEvent.KEY_RIGHT);
        moveRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        this.keyboard.addEventListener(moveRight);

        KeyboardEvent moveLeft = new KeyboardEvent();
        moveLeft.setKey(KeyboardEvent.KEY_LEFT);
        moveLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        this.keyboard.addEventListener(moveLeft);

        KeyboardEvent moveUp = new KeyboardEvent();
        moveUp.setKey(KeyboardEvent.KEY_UP);
        moveUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        this.keyboard.addEventListener(moveUp);

        KeyboardEvent moveDown = new KeyboardEvent();
        moveDown.setKey(KeyboardEvent.KEY_DOWN);
        moveDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        this.keyboard.addEventListener(moveDown);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if (!cars[cars.length - 1].isCrashed()) {

            switch (keyboardEvent.getKey()) {
                case KeyboardEvent.KEY_RIGHT:
                    cars[cars.length - 1].getPos().moveInDirection(GridDirection.RIGHT, 1);
                    break;
                case KeyboardEvent.KEY_LEFT:
                    cars[cars.length - 1].getPos().moveInDirection(GridDirection.LEFT, 1);
                    break;
                case KeyboardEvent.KEY_UP:
                    cars[cars.length - 1].getPos().moveInDirection(GridDirection.UP, 1);
                    break;
                case KeyboardEvent.KEY_DOWN:
                    cars[cars.length - 1].getPos().moveInDirection(GridDirection.DOWN, 1);
                    break;
            }
            collisionDetector.check(cars[cars.length - 1]);
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
