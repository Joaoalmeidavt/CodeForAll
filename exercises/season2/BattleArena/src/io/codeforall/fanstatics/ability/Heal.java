package io.codeforall.fanstatics.ability;

import io.codeforall.fanstatics.hero.Hero;

public class Heal extends AbstractAbility{
    public Heal(String name) {
        super(name, 20);
    }

    @Override
    public void use(Hero source, Hero target){
        source.setMana(source.getMana() - super.getManaCost());
        target.setHealth(target.getHealth() + 50);
        source.getAbility().setCooldown(5);
    }
}
