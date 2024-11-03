public class Main {
    public static void main(String[] args) {
        Player pl1 = new Player("Diogo");
        Player pl2 = new Player("Leonardo");

        Game game = new Game(pl1, pl2);
        game.play(3);
    }
}