package ex2;

public class Guitar extends Instrument {
    private int numStrings;

    public Guitar(String type, int numStrings, String color) {
        super(type, color);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return this.numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public void breakString() {
        this.numStrings--;
    }

    public void play() {
        System.out.println("Playing... Dling dling dlong...");
    }


}
