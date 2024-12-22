package io.codeforall.fanstatics.ability;

public abstract class AbstractAbility implements Ability {
    private int cooldown;
    private String name;
    private int manaCost;

    public AbstractAbility(String name, int manaCost){
        this.cooldown = 0;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getCooldown() {
        return cooldown;
    }

    public int getManaCost(){
        return manaCost;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }
}
