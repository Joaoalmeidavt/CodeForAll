package io.codeforall.bootcamp;

public class Genie {

    public int wishesGranted;
    public int maxWishes;

    public Genie(int maxWishes) {
        this.maxWishes = maxWishes;
        this.wishesGranted = 0;
    }

    public void grant() {
        this.wishesGranted++;
        System.out.println("Granting wish.........");
    }

    public void deny() {
        System.out.println("Denying wish..........");
    }
}
