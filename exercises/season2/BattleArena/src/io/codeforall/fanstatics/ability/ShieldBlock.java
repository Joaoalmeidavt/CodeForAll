package io.codeforall.fanstatics.ability;

import io.codeforall.fanstatics.hero.Hero;

public class ShieldBlock extends AbstractAbility{
    public ShieldBlock(String name) {
        super(name, 20);
    }

    @Override
    public void use(Hero source, Hero target) {
        source.setMana(source.getMana() - super.getManaCost());
        target.setShield(20);
        source.getAbility().setCooldown(5);
    }
}
