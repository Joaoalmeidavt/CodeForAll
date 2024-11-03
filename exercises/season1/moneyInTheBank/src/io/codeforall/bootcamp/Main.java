package io.codeforall.bootcamp;

public class Main {
    public static void main(String[] args) {
        Person client = new Person("Toy", 1000, "Plumber", 800);
        Person friend = new Person("Frida", 10);

        client.work();
        client.take(200);
        client.spend(10000);
        client.work();
        client.displayMoney();
        client.spend(10);
        client.lend(10, friend);
    }
}
