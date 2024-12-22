package Heroes;

import Abilities.Fireball;

public class Mage extends Hero {
    public Mage(int health, int mana, int damage, int defence) {
        super("Mage",80, 150, 35, 10);
        this.ability=new Fireball(30,3,this);
    }
    @Override
    public void performAction() {
        useAbility();

    }

    @Override
    public int getDamage() {
        return super.getDamage();
    }

    @Override
    public int getDefence() {
        return super.getDefence();
    }



    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public int getMana() {
        return super.getMana();
    }
}
