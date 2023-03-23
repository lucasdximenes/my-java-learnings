package repetitiveStructures.whileLoop.exercises;

import java.util.Scanner;

public class exercise_whileLoop_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcoholSum = 0;
        int gasolineSum = 0;
        int dieselSum = 0;
        int fuelCode = sc.nextInt();

        while (fuelCode != 4) {
            if (fuelCode == 1) {
                alcoholSum += 1;
            } else if (fuelCode == 2) {
                gasolineSum += 1;
            } else if (fuelCode == 3) {
                dieselSum += 1;
            }

            fuelCode = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcoholSum);
        System.out.println("Gasolina: " + gasolineSum);
        System.out.println("Diesel: " + dieselSum);

        sc.close();
    }
}
