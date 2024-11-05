package io.codeforall.fanstatics.hero;

import io.codeforall.fanstatics.ability.ShieldBlock;

public class Warrior extends Hero{
    public Warrior(String name){
        super(name);
        this.setAbility(new ShieldBlock());
    }
}
