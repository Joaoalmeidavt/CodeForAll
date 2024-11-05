package io.codeforall.fanstatics.ability;

public abstract class AbstractAbility implements Ability {
    private int cooldown;
    private String name;

    public AbstractAbility(String name){
        this.cooldown = 0;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getCooldown() {
        return cooldown;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }
}
