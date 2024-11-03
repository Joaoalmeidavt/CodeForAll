package ex2;

public class Sandbox {
    public static void main(String[] args) {
        Guitar favourite = new Guitar("classical", 6, "wood");
        System.out.println(favourite.getType());
        System.out.println(favourite.getNumStrings());
        System.out.println(favourite.getColor());
        favourite.breakString();
        System.out.println(favourite.getNumStrings());
        favourite.play();
    }
}
