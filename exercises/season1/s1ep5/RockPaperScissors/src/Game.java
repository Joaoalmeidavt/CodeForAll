public class Game {
    public Player pl1;
    public Player pl2;

    public Game(Player pl1, Player pl2) {
        this.pl1 = pl1;
        this.pl2 = pl2;
    }

    public void play(int rounds) {
        int i = 0;
        while (i < 3 && (this.pl1.wins != 2 && this.pl2.wins != 2)) {
            Move pl1Move = this.pl1.playMove();
            Move pl2Move = this.pl2.playMove();

            switch (pl1Move) {
                case ROCK:
                    switch (pl2Move) {
                        case ROCK:
                            break;
                        case PAPER:
                            System.out.println(this.pl2.name + " wins!");
                            pl2.win();
                            break;
                        case SCISSORS:
                            System.out.println(this.pl1.name + " wins!");
                            pl1.win();
                            break;
                    }
                    break;
                case PAPER:
                    switch (pl2Move) {
                        case ROCK:
                            System.out.println(this.pl1.name + " wins!");
                            pl1.win();
                            break;
                        case PAPER:
                            break;
                        case SCISSORS:
                            System.out.println(this.pl2.name + " wins!");
                            pl2.win();
                            break;
                    }
                    break;
                case SCISSORS:
                    switch (pl2Move) {
                        case ROCK:
                            System.out.println(this.pl2.name + " wins!");
                            pl2.win();
                            break;
                        case PAPER:
                            System.out.println(this.pl1.name + " wins!");
                            pl1.win();
                            break;
                        case SCISSORS:
                            break;
                    }
                    break;
            }
            i++;
        }
        if (pl1.wins > pl2.wins) {
            System.out.println(pl1.name + " is the winner!");
        } else if (pl1.wins < pl2.wins) {
            System.out.println(pl2.name + " is the winner!");
        } else {
            System.out.println("Tie!");
        }
    }
}
