public class Game {
    public int answer;

    public Game() {
        answer = RandomNumberGenerator.getRandom();
    }

    public boolean checkAnswer(int guess) {
        return (guess == this.answer);
    }
}
