package io.codeforall.fanstatics.ability;

public abstract class AbstractAbility implements Ability {
    private int cooldown;

    public AbstractAbility(){
        this.cooldown = 5;
    }

    public int getCooldown() {
        return cooldown;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }
}
