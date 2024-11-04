package io.codeforall.fanstatics.hero;

import io.codeforall.fanstatics.ability.Fireball;

public class Mage extends Hero{
    public Mage(){
        super();
        this.setAbility(new Fireball());
    }

    @Override
    public String toString(){
        return "Mage";
    }
}
