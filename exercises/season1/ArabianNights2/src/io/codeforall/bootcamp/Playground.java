package io.codeforall.bootcamp;

public class Playground {
    public static void main(String[] args) {
        MagicLamp lamp1 = new MagicLamp(3);
        for (int i = 0; i < 5; i++) {
            lamp1.rub();
        }
        System.out.println("########################### Recycling ###########################");
        lamp1.recycle();
        for (int i = 0; i < 5; i++) {
            lamp1.rub();
        }

        MagicLamp lamp2 = new MagicLamp(3);
        for (int i = 0; i < 2; i++) {
            lamp2.rub();
        }
        System.out.println("########################### Recycling ###########################");
        lamp2.recycle();
        for (int i = 0; i < 2; i++) {
            lamp2.rub();
        }

        System.out.println("\n" + lamp1);
        System.out.println("\n" + lamp2);

        MagicLamp lamp3 = new MagicLamp(3);
        Genie[] genies = new Genie[3];
    }
}
