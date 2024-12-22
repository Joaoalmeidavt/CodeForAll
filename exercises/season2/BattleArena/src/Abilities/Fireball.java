package Abilities;

import Heroes.Hero;

public class Fireball extends AbstractAbility{
    public Fireball(int manaCost, int cooldown, Hero hero) {
        super(manaCost  , cooldown, hero);
    }

    @Override
    public void useAbility() {
        if(canUseAbility()){
           int damage= hero.getDamage()*2;
            System.out.println(hero.getName() + " uses Fireball, dealing " + damage + " damage!");
            hero.reduceMana(manaCost);
            resetCooldown(3);
        }
        System.out.println("Cant use fireball");


    }

    @Override
    public int getCooldown() {
        return 0;
    }

    @Override
    public int getManaCost() {
        return 0;
    }
}
