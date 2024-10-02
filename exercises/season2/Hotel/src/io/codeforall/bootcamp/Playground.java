package io.codeforall.bootcamp;

public class Playground {

    public static void main(String[] args) {
        Hotel plazaHotel = new Hotel("Plaza",5);
        Person guest = new Person("Toy", plazaHotel);
        guest.checkIn();
        guest.checkIn();
        guest.checkOut();

        Person guest1 = new Person("José Malhoa", plazaHotel);
        guest1.checkOut();
    }
}
