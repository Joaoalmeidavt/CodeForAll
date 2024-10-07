package io.codeforall.bootcamp.cars;

public class CarFactory {
    public static Car getNewCar() {
        return Math.random() * 4 > 3 ? new Mustang() : new Fiat();
    }
}
