package io.codeforall.fanstatics;

import io.codeforall.fanstatics.hero.Cleric;
import io.codeforall.fanstatics.hero.Mage;
import io.codeforall.fanstatics.hero.Rogue;

public class Main {
    public static void main(String[] args) {
        Arena arena = new Arena(new Cleric(), new Mage(), new Rogue());
        arena.start();
    }
}
