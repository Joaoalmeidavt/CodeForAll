package io.codeforall.bootcamp;

public class RecyclableDeamon extends Genie {
    public RecyclableDeamon(int maxWishes){
        super(maxWishes);
    }
    @Override
    public void grant() {
        super.grant();
        System.out.println("#$%#$%#$%#$% Evil wish #$%#$%#$%#$%");
    }
}
