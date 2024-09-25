package ex2;

public class Guitar {
    private String type;
    private int numStrings;
    private String color;

    public Guitar(String type, int numStrings, String color){
        this.type = type;
        this.numStrings = numStrings;
        this.color = color;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public int getNumStrings() {
        return this.numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
