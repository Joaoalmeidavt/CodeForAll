package Heroes;

import Abilities.Ability;

public abstract class Hero {
    private int health;
    private int mana;
    private int damage;
    private int defence;
    private String name;
    protected Ability ability;

    public Hero(String name, int health, int mana, int damage, int defence) {
        this.health = health;
        this.mana = mana;
        this.damage = damage;
        this.defence = defence;
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = Math.max(health, 0); // Health cannot be negative
    }

    public void setMana(int mana) {
        this.mana = Math.max(mana, 0);
    }

    public void reduceMana(int amount) {
        setMana(this.mana - amount);
    }

    public String getName() {
        return name;
    }

    public int getMana() {
        return mana;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getDefence() {
        return defence;
    }


    // Method to use the special ability if available
    public void takeDamage(int damageAmount) {
        int effectiveDamage = Math.max(damageAmount - defence, 0); // Reduce damage by defense
        setHealth(this.health - effectiveDamage);
        System.out.println(name + " takes " + effectiveDamage + " damage. Remaining health: " + health);
    }

    // Method to take a turn, either using the ability or performing a normal attack
    public void takeTurn(Hero target) {
        if (ability != null && ability.canUseAbility()) {
            ability.useAbility(); // Use the special ability
        } else {
            performNormalAttack(target); // Perform a regular attack if the ability is not available
        }
    }

    // Method to perform a normal attack
    private void performNormalAttack(Hero target) {
        System.out.println(name + " performs a normal attack, dealing " + damage + " damage to " + target.getName() + "!");
        target.takeDamage(damage); // Apply the damage to the target hero
    }

    // Abstract method to be implemented by subclasses
    public abstract void performAction();
    }



