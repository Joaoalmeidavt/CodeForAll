package Abilities;

import Heroes.Hero;

public abstract class AbstractAbility implements Ability {
    int manaCost;
    int cooldown;
    Hero hero;

    public AbstractAbility(int manaCost, int cooldown, Hero hero) {
        this.manaCost = manaCost;
        this.cooldown = cooldown;
        this.hero = hero;
    }

    @Override
    public boolean canUseAbility() {
        return cooldown <= 0 && hero.getMana() >= manaCost && hero.getHealth() > 0;
    }

    @Override
    public abstract void useAbility();

    public void reduceCooldown() {
        if (cooldown > 0) cooldown--;
    }

    public void resetCooldown(int initialCooldown) {
        this.cooldown = initialCooldown;
    }

    public boolean hasSufficientMana() {
        return hero.getMana() >= manaCost;
    }

    public boolean isHeroAlive() {
        return hero.getHealth() > 0;
    }
}
