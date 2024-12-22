package io.codeforall.fanstatics;

import io.codeforall.fanstatics.hero.Hero;

import java.util.List;

public class TurnManager {
    private int round;
    public List<Hero> players;

    public TurnManager(List<Hero> players) {
        this.round = 0;
        this.players = players;
    }

    public List<Hero> newRound() {
        this.round++;
        if(this.players.size() == 1){
            System.out.println(this.players.get(0) + " is the winner!");
            return null;
        }
        System.out.println("\n&%$#&%$# Round " + this.round + " #$%&#$%&");
        for (int k = 0; k < this.players.size() * 10; k++) {
            int i = (int) (Math.random() * this.players.size());
            int j = (int) (Math.random() * this.players.size());
            Hero temp = this.players.get(i);
            this.players.set(i, this.players.get(j));
            this.players.set(j, temp);
        }
        for (Hero player : this.players) {
           if(round % 3 == 0){
               player.getAbility().setCooldown(0);
           }
           if(player.getHealth() <= 0){
               System.out.println(player + " has died :c");
           }
        }
        this.players.removeIf(player -> player.getHealth() <= 0);
        return this.players;
    }
}
