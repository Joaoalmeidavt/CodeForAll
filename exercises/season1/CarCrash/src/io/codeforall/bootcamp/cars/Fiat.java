package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Field;
import io.codeforall.bootcamp.field.Position;

public class Fiat extends Car {
    public boolean crashed;
    public Fiat(){
        super();
        this.crashed = false;
    }

    @Override
    public String toString(){
        if(super.isCrashed()){
            return "C";
        }
        return "F";
    }
}
