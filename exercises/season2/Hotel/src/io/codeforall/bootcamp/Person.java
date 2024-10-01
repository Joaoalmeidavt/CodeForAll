package io.codeforall.bootcamp;

public class Person {
    public String name;
    public Hotel myHotel;
    public int roomNumber;
    public int key;

    public Person(String name, Hotel hotel){
        this.name = name;
        this.myHotel = hotel;
        this.roomNumber = -1;
        this.key = -1;
    }

    public void checkIn(){
        this.roomNumber = this.myHotel.checkIn();
        this.key = System.identityHashCode(this.myHotel);
        System.out.println(this.name +
                " checking in " +
                this.myHotel.name +
                " in room " +
                this.roomNumber +
                " with key " +
                this.key + ".");
    }

    public void checkOut(){
        this.myHotel.checkOut(this.myHotel.rooms[this.roomNumber]);
        this.roomNumber = -1;
        this.key = -1;
        System.out.println(this.name +
                " checking out " +
                this.myHotel.name + ".");
    }
}
