package io.codeforall.bootcamp;

public abstract class Genie {
    public int maxWishes;
    public int wishesGranted;

    public Genie(int maxWishes) {
        this.maxWishes = maxWishes;
        this.wishesGranted = 0;
    }

    public abstract void grant();
}
