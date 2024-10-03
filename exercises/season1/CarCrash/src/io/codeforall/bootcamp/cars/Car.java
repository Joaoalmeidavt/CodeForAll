package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Position;

abstract public class Car {

    /** The position of the car on the grid */
    private Position pos;
    private boolean crashed;

    public void setPos(Position pos) {
        this.pos = pos;
    }

    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return this.crashed;
    }

    public void setCrashed(){
        this.crashed = true;
    }

}
