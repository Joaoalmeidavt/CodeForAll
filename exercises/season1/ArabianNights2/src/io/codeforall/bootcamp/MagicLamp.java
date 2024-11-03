package io.codeforall.bootcamp;

public class MagicLamp {
    private int maxGenies;
    public int geniesUsed;
    private int counter;
    public int recycled;

    public MagicLamp(int maxGenies) {
        this.maxGenies = maxGenies;
        this.counter = 0;
    }

    public void rub() {
        this.counter++;
        Genie chosen;
        Genie grumpy = new GrumpyGenie(1);
        Genie friendly = new FriendlyGenie(10);
        Genie deamon = new RecyclableDeamon(15);

        if (this.counter <= this.maxGenies) {
            chosen = this.counter % 2 == 0 ? friendly : grumpy;
        } else {
            chosen = deamon;
        }

        while (chosen == deamon && chosen.wishesGranted < chosen.maxWishes) {
            chosen.grant();
        }
        while (chosen.wishesGranted < chosen.maxWishes) {
            chosen.grant();
        }
        if (chosen != deamon) {
            chosen.deny();
        }
    }

    public void recycle() {
        this.recycled++;
        this.counter = 0;
    }

    @Override
    public String toString() {
        return "Lamp INFO" +
               "\nMax genies: " + this.maxGenies +
               "\nRemaining genies: " + (this.counter > this.maxGenies ? 0 : this.maxGenies - this.counter) +
               "\nNo. times recharged: " + this.recycled;
    }
}
