package memoryArrayLists.arrays.challenge.entities;

public class Tenant {
    private String name;
    private String email;
    private int roomNumber;

    public Tenant(String name, String email, int roomNumber) {
        this.name = name;
        this.email = email;
        this.roomNumber = roomNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getRoomNumber() {
        return  roomNumber;
    }
}
