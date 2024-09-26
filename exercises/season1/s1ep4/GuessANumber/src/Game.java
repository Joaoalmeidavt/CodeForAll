public class Game {
    public int answer;
    public Player pl1;
    public Player pl2;

    public Game(Player pl1, Player pl2) {
        answer = RandomNumberGenerator.getRandom();
        System.out.println("The hidden number is " + answer + ".");
        this.pl1 = pl1;
        this.pl2 = pl2;
    }

    public boolean checkAnswer(int guess) {
        return (guess == this.answer);
    }

    public void play() {
        boolean found = false;
        while(!found) {
            int guess1 = pl1.generateGuess();
            int guess2 = pl2.generateGuess();
            System.out.println(pl1.name + " guesses " + guess1 + " and " + pl2.name + " guesses " + guess2 + ".");
            found = (this.checkAnswer(guess1) || this.checkAnswer(guess2));
        }
        System.out.println((checkAnswer(pl1.guess)) ? pl1.name + " won!" : pl2.name + " won!");
    }
}
