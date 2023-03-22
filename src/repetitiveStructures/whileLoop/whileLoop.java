package repetitiveStructures.whileLoop;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        // While:
        /*
         * While loop: - Run a loop while some condition is true
         * while(<condition>) {
         *  <commands>
         * }
         * */
        // ex:
        /*
         * Create a program that reads integer numbers until a zero is read.
         * At the end it shows the sum of the whole numbers read.
         * */
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int sum = 0;

        while (x != 0) {
            sum += x;
            x = sc.nextInt();
        }

        System.out.println(sum);

        sc.close();
    }
}
