import java.util.Random;

public class Player {
    public String name;
    public int wins;

    Player(String name){
        this.name = name;
        this.wins = 0;
    }

    public Move playMove(){
        return Move.values()[RandomGenerator.getRandint()];
    }

    public void win(){
        this.wins++;
    }
}
