public class Main {
    public static void main(String[] args) {
        System.out.println("Two player game...............................");
        Player pl1 = new Player("Diogo");
        Player pl2 = new Player("Leonardo");

        Game guessMyNumber = new Game(pl1, pl2);
        guessMyNumber.play();
        System.out.println("..............................................");

        System.out.println("Ten player game...............................");
        Player[] players = new Player[10];
        for(int i=0; i<players.length; i++){
            players[i] = new Player();
        }

        Game multiGuessMyNumber = new Game(players);
        multiGuessMyNumber.multiPlay();
        System.out.println("..............................................");
    }
}