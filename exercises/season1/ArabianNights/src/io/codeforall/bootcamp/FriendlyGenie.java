package io.codeforall.bootcamp;

public class FriendlyGenie extends Genie {
    public FriendlyGenie(int maxWishes){
        super(maxWishes);
    }

    @Override
    public void grant(){
        if(super.wishesGranted < super.maxWishes){
            System.out.println("#$%&#$%&#$%& Friendly Wish Granted #$%&#$%&#$%&");
            super.wishesGranted++;
            return;
        }
        System.out.println("Friendly Genie has no more wishes to grant.");
    }
}
