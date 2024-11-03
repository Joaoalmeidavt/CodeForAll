package io.codeforall.bootcamp;

public class GrumpyGenie extends Genie {

    public GrumpyGenie(int maxWishes) {
        super(maxWishes);
    }
    @Override
    public void grant() {
        super.grant();
        System.out.println("#$%#$%#$%#$% Grumpy wish #$%#$%#$%#$%");
    }
}
