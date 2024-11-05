package io.codeforall.fanstatics.hero;

import io.codeforall.fanstatics.ability.ShieldBlock;

public class Warrior extends Hero{
    public boolean shieldOn;
    public Warrior(String name){
        super("Warrior", name);
        this.setAbility(new ShieldBlock("ShieldBlock"));
        this.shieldOn = false;
    }
}
