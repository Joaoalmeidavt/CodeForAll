package io.codeforall.fanstatics.hero;

import io.codeforall.fanstatics.ability.Heal;

public class Cleric extends Hero {
    public Cleric(String name){
        super("Cleric", name);
        this.setAbility(new Heal("Heal"));
    }
}
