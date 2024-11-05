package io.codeforall.fanstatics;

import io.codeforall.fanstatics.hero.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Arena {
    private List<Hero> players;
    private TurnManager turnManager;

    public Arena(Hero... players) {
        this.players = new ArrayList<>();
        for (Hero hero : players) {
            this.players.add(hero);
        }
        this.turnManager = new TurnManager(this.players);
    }

    public void start(int rounds) {
        Stream.of(this.players).forEach(System.out::println);
        for (int i = 0; i < rounds; i++) {
            List<Hero> playerOrder = this.turnManager.newRound();
            for (int j = 0; j < playerOrder.size(); j++) {
                Hero attacker = playerOrder.get(j);
                int k = j;
                while (k == j) {
                    k = (int) (Math.random() * playerOrder.size());
                }
                Hero victim = playerOrder.get(k);
                System.out.println(attacker + " against " + victim);
            }
        }
    }


}
