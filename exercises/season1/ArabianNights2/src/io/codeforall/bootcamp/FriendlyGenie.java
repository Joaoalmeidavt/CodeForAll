package io.codeforall.bootcamp;

public class FriendlyGenie extends Genie {
    public FriendlyGenie(int maxWishes) {
        super(maxWishes);
    }

    @Override
    public void grant() {
        super.grant();
        System.out.println("#$%#$%#$%#$% Friendly wish #$%#$%#$%#$%");
    }
}
