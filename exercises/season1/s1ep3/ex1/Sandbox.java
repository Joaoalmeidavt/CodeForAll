public class Sandbox {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator("casio", "silver" );
        Calculator calc2 = new Calculator("texas", "silver" );
        Calculator calc3 = new Calculator("xiaomi", "silver" );

        System.out.println(Calculator.getCalculatorsManufactured());
    }
}
