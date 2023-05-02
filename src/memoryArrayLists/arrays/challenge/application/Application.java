package memoryArrayLists.arrays.challenge.application;

import memoryArrayLists.arrays.challenge.entities.Tenant;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int roomsRented = sc.nextInt();
        sc.nextLine();
        Tenant[] totalRooms = new Tenant[10];
        System.out.println(Arrays.toString(totalRooms));

        for (int i = 1; i <= roomsRented; i++) {
            System.out.println("Rent #" + i);

            System.out.print("Name: ");
            String tenantName = sc.nextLine();

            System.out.print("Email: ");
            String tenantEmail = sc.nextLine();

            System.out.print("Room: ");
            int tenantRentedRoom = sc.nextInt();
            sc.nextLine();

            totalRooms[tenantRentedRoom] = new Tenant(tenantName, tenantEmail, tenantRentedRoom);
        }

        System.out.println(Arrays.toString(totalRooms));

        System.out.println("Busy rooms:");
        for (Tenant room : totalRooms) {
            if (room != null) {
                System.out.printf("%d: %s, %s%n", room.getRoomNumber(), room.getName(), room.getEmail());
            }
        }

        sc.close();
    }
}
