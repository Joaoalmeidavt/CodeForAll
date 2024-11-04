package io.codeforall.fanstatics;

import io.codeforall.fanstatics.hero.Hero;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Arena {
    private ArrayList<Hero> players;

    public Arena(Hero... players){
        this.players = (ArrayList<Hero>) Stream.of(players).toList();
    }

    public void start(){
        Stream.of(this.players).forEach(System.out::println);
    }


}
