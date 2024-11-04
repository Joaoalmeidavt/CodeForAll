package io.codeforall.fanstatics.hero;

import io.codeforall.fanstatics.ability.Ability;

public abstract class Hero {
    private int health = 200;
    private int mana = 500;
    private int attackDamage = 20;

    private Ability ability;

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getAttackDamage() {
        return attackDamage;
    }
}
