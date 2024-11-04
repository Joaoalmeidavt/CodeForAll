package io.codeforall.fanstatics.hero;

import io.codeforall.fanstatics.ability.Heal;

public class Cleric extends Hero {
    public Cleric(){
        super();
        this.setAbility(new Heal());
    }

    @Override
    public String toString(){
        return "Cleric";
    }
}
