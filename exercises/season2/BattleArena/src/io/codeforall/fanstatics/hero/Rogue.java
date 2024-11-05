package io.codeforall.fanstatics.hero;

import io.codeforall.fanstatics.ability.SneakAttack;

public class Rogue extends Hero{
    public Rogue(String name){
        super(name);
        this.setAbility(new SneakAttack());
    }
}
