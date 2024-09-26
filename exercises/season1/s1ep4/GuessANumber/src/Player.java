import java.util.Arrays;

public class Player {
    public String name;
    public int guess;
    public int nTries;
    public int[] guesses = new int[11];

    public Player(){
    }

    public Player(String name) {
        this.name = name;
        this.nTries = 0;
        Arrays.fill(guesses, 11);
        System.out.println(name + " is playing...");
    }

    public boolean checkIfNew(int newGuess) {
        for (int guess : this.guesses) {
            if (newGuess == guess) {
                return false;
            }
        }
        return true;
    }

    public int generateGuess() {
        this.guess = RandomNumberGenerator.getRandom();
        while (!checkIfNew(this.guess)) {
            this.guess = RandomNumberGenerator.getRandom();
        }
        this.guesses[this.nTries] = this.guess;
        this.nTries++;
        return this.guess;
    }
}
