package io.codeforall.bootcamp;

public class RecyclableDeamon extends Genie {
    public RecyclableDeamon(int maxWishes){
        super(maxWishes);
    }

    @Override
    public void grant(){
        super.wishesGranted++;
        System.out.println("#$%&#$%&#$%& Demonic Wish Granted #$%&#$%&#$%&");
    }

}
