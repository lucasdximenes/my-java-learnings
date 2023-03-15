package sequentialStructure.exercises;

import java.util.Scanner;

public class exercise_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.nextInt();
        int  pieceQuantity1 = sc.nextInt();
        double piecePrice1 = sc.nextDouble();

        sc.nextInt();
        int  pieceQuantity2 = sc.nextInt();
        double piecePrice2 = sc.nextDouble();

        double totalValue = ((pieceQuantity1 * piecePrice1) + (pieceQuantity2 * piecePrice2));

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalValue);

        sc.close();
    }
}
