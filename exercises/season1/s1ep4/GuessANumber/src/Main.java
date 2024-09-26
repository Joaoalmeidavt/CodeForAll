public class Main {
    public static void main(String[] args) {
        Player pl1 = new Player("Diogo");
        Player pl2 = new Player("Leonardo");

        Game guessMyNumber = new Game(pl1, pl2);
        guessMyNumber.play();


    }
}