package io.codeforall.bootcamp;

public class Hotel {
    public String name;
    public int numberOfRooms;
    public Room[] rooms;
    public boolean availableRooms;

    public Hotel(String name, int nStars) {
        this.name = name;
        this.availableRooms = true;
        this.numberOfRooms = nStars >= 4 ? 200 : 100;
        this.rooms = createRooms(this.numberOfRooms);
    }

    private Room[] createRooms(int nr){
        Room[] rs = new Room[nr];
        for (int i = 0; i < nr; i++) {
            rs[i] = new Room();
        }
       return rs;
    }

    private int getAvailableRoom() {
        for (int i = 0; i < this.numberOfRooms; i++) {
            if (this.rooms[i].available) {
                return i;
            }
        }
        this.availableRooms = false;
        return -1;
    }

    public int checkIn() {
        if (this.availableRooms) {
            int roomNumber = this.getAvailableRoom();
            this.rooms[roomNumber].checkedIn = true;
            this.rooms[roomNumber].available = false;
            return roomNumber;
        }
        return -1;
    }

    public void checkOut(Room room) {
        room.checkedIn = false;
        room.available = true;
    }
}
