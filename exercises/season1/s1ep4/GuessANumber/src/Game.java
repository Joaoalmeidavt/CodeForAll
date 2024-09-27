import java.util.Arrays;
public class Game {
    public int answer;
    public Player pl1;
    public Player pl2;
    public Player[] players;
    public int[] guesses;

    public int maxGuesses = 10;

    public Game(Player pl1, Player pl2) {
        answer = RandomNumberGenerator.getRandom();
        System.out.println("The hidden number is " + answer + ".");
        this.pl1 = pl1;
        this.pl2 = pl2;
    }

    public Game(Player[] players) {
        this.players = players;
        this.guesses = new int[players.length];
        Arrays.fill(this.guesses, 11);
        answer = RandomNumberGenerator.getRandom();
        System.out.println("The hidden number is " + answer + ".");
    }

    public boolean checkAnswer(int guess) {
        return (guess == this.answer);
    }

    public void play() {
        boolean found = false;
        int nTries = 0;
        while(!found && (nTries < this.maxGuesses)) {
            int guess1 = pl1.generateGuess();
            int guess2 = pl2.generateGuess();
            System.out.println(pl1.name + " guesses " + guess1 + " and " + pl2.name + " guesses " + guess2 + ".");
            found = (this.checkAnswer(guess1) || this.checkAnswer(guess2));
            nTries++;
        }
        if(nTries < this.maxGuesses){
            System.out.println((checkAnswer(pl1.guess)) ? pl1.name + " won!" : pl2.name + " won!");
        } else {
            System.out.println("Game won!");
        }
    }

    public void multiPlay() {
        boolean found = false;
        int nTries = 0;
        while(!found && (nTries < this.maxGuesses)) {
            for(int i = 0; i< players.length; i++){
                this.guesses[i] = this.players[i].generateGuess();
                found = found || this.checkAnswer(this.guesses[i]);
                if(found) {
                    break;
                }
            }
            nTries++;
        }
        if(nTries < this.maxGuesses) {
            for (int i = 0; i < players.length; i++) {
                if (this.checkAnswer(this.guesses[i])) {
                    System.out.println("Player" + i + " won!");
                }
            }
        } else {
            System.out.println("Game won!");
        }
    }
}
