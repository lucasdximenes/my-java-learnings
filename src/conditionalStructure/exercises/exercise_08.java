package conditionalStructure.exercises;

import java.util.Scanner;

public class exercise_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextFloat();
        double tax;

        if (salary <= 2000.00) {
            tax = 0.00;
        } else if (salary <= 3000.00) {
            tax = (salary - 2000.00) * 0.08;
        } else if (salary <= 4500.00) {
            tax = ((salary - 3000.00) * 0.18) + (1000.00 * 0.08);
        } else {
            tax = ((salary - 4500.00) * 0.28) + (1500.00 * 0.18) + (1000.00 * 0.08);
        }

        if (tax == 0.00) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", tax);
        }

        sc.close();
    }
}
