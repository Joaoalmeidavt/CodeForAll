package io.codeforall.bootcamp;

public class Playground {
    public static void main(String[] args) {
        MagicLamp lamp1 = new MagicLamp(3);
        Genie[] genies = new Genie[]{
                lamp1.rub(),
                lamp1.rub(),
                lamp1.rub(),
                lamp1.rub()
        };

        genies[0].grant();
        genies[2].grant();

        genies[0].grant();

        genies[3].grant();

        lamp1.recycle();

        for (int i = 0; i < 4; i++) {
            genies[i] = lamp1.rub();
        }
        genies[0].grant();

        MagicLamp lamp2 = new MagicLamp(3);
        System.out.println(lamp1.compareLamps(lamp2));
    }
}
