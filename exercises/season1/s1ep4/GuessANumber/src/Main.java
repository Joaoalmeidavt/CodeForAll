public class Main {
    public static void main(String[] args) {
        Game guessMyNumber = new Game();
        System.out.println("The hidden number is " + guessMyNumber.answer + ".");

        boolean found = false;
        while(!found) {
            int guess = Player.generateGuess();
            System.out.println("My new guess is " + guess + ".");
            found = guessMyNumber.checkAnswer(guess);
        }
        System.out.println("I finally guessed the hidden number!");
    }
}