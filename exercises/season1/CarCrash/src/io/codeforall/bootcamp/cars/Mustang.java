package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Field;
import io.codeforall.bootcamp.field.Position;

public class Mustang extends Car {
    public boolean crashed;

    public Mustang() {
        super();
        this.crashed = false;
    }

    @Override
    public String toString() {
        if (super.isCrashed()) {
            return "C";
        }
        return "M";
    }

}
