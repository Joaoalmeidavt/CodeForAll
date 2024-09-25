package ex2;

public class Instrument {
    private String type;
    private String color;

    public Instrument(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
