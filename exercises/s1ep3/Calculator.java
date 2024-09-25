public class Calculator {
    public String colour = "black";
    public String brand = "texas";

    public Calculator(String brand, String colour) {
        this.colour = colour;
        this.brand = brand;
    }

    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public float add(float number1, float number2) {
        return number1 + number2;
    }

    public int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public float add(float number1, float number2, float number3) {
        return number1 + number2 + number3;
    }
}
