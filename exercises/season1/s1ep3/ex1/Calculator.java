public class Calculator {
    private String colour = "black";
    private String brand = "texas";
    private static int calculatorsManufactured;

    public Calculator(String brand, String colour) {
        this.colour = colour;
        this.brand = brand;
        calculatorsManufactured++;
    }

    public String getBrand() {
        return brand;
    }

    public void setColour(String colour){
        this.colour = colour;
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

    public static int getCalculatorsManufactured(){
        return calculatorsManufactured;
    }
}
