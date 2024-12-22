import Heroes.Hero;

import java.util.ArrayList;
import java.util.List;

public class Arena {
    private List<Hero> heroes;
    private TurnManager turnManager;

    public Arena(){
        heroes=new ArrayList<>();
        turnManager=new TurnManager();
    }
    public void addHero(Hero hero) {
        heroes.add(hero);
    }
}
