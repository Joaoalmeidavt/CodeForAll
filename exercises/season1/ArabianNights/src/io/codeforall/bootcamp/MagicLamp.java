package io.codeforall.bootcamp;

public class MagicLamp {
    public int maxGenies;
    public int counter;
    public int recycledTimes;

    public MagicLamp(int maxGenies){
        this.maxGenies = maxGenies;
        this.counter = 0;
        this.recycledTimes = 0;
    }

    public Genie rub(){
        this.counter++;
        Genie chosen;
        if(this.counter <= this.maxGenies){
            chosen = (this.counter % 2 == 0 ? new FriendlyGenie(5) : new GrumpyGenie(3));
        } else {
            chosen = new RecyclableDemon(6);
        }
        return chosen;
    }

    public void recycle(){
        this.counter = 0;
        this.recycledTimes++;
    }

    public boolean compareLamps(MagicLamp lamp){
        return (this.maxGenies == lamp.maxGenies &&
                this.recycledTimes == lamp.recycledTimes &&
                this.counter == lamp.counter)
                ? true : false;
    }
}
