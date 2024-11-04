package io.codeforall.fanstatics.hero;

import io.codeforall.fanstatics.ability.SneakAttack;

public class Rogue extends Hero{
    public Rogue(){
        super();
        this.setAbility(new SneakAttack());
    }

    @Override
    public String toString(){
        return "Rogue";
    }
}
