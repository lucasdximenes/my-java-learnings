package conditionalStructure.exercises;

import java.util.Scanner;

public class exercise_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int itemCode = sc.nextInt();
        int itemQuantity = sc.nextInt();

        if (itemCode == 1) {
            System.out.printf("Total: R$ %.2f", itemQuantity * 4.00);
        } else if (itemCode == 2) {
            System.out.printf("Total: R$ %.2f", itemQuantity * 4.50);
        } else if (itemCode == 3) {
            System.out.printf("Total: R$ %.2f", itemQuantity * 5.00);
        } else if (itemCode == 4) {
            System.out.printf("Total: R$ %.2f", itemQuantity * 2.00);
        } else if (itemCode == 5) {
            System.out.printf("Total: R$ %.2f", itemQuantity * 1.50);
        }

        sc.close();
    }
}
