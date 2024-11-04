package io.codeforall.fanstatics.hero;

import io.codeforall.fanstatics.ability.ShieldBlock;

public class Warrior extends Hero{
    public Warrior(){
        super();
        this.setAbility(new ShieldBlock());
    }

    @Override
    public String toString(){
        return "Warrior";
    }
}
