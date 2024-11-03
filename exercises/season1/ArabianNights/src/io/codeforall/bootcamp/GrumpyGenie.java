package io.codeforall.bootcamp;

public class GrumpyGenie extends Genie {
    public GrumpyGenie(int maxWishes){
        super(maxWishes);
    }

    @Override
    public void grant(){
        if(this.wishesGranted < 1){
            System.out.println("#$%&#$%&#$%& Grumpy Wish Granted #$%&#$%&#$%&");
            super.wishesGranted++;
            return;
        }
        System.out.println("Grumpy Genie has no more wishes to grant.");
    }
}
