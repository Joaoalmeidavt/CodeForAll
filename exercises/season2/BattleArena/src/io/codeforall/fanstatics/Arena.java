package io.codeforall.fanstatics;

import io.codeforall.fanstatics.hero.Hero;

import java.util.List;
import java.util.stream.Stream;

public class Arena {
    private List<Hero> players;

    public Arena(Hero... players){
        this.players = Stream.of(players).toList();
    }

    public void start(){
        Stream.of(this.players).forEach(System.out::println);
    }


}
