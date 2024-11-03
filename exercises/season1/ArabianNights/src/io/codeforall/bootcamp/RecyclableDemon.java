package io.codeforall.bootcamp;

public class RecyclableDemon extends Genie {
    public RecyclableDemon(int maxWishes){
        super(maxWishes);
    }

    @Override
    public void grant(){
        super.wishesGranted++;
        System.out.println("#$%&#$%&#$%& Demonic Wish Granted #$%&#$%&#$%&");
    }

}
