package io.codeforall.fanstatics.ability;

import io.codeforall.fanstatics.hero.Hero;

public class ShieldBlock extends AbstractAbility{
    @Override
    public void use(Hero source, Hero target) {
        source.setMana(source.getMana() - 20);
    }
}
