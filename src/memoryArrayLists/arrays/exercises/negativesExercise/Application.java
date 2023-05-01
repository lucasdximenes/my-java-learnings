package memoryArrayLists.arrays.exercises.negativesExercise;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you type? ");
        int N = sc.nextInt();
        while (N <= 0 || N > 10) {
            System.out.println("Number must be greater than 0 and less than or equal to 10");
            System.out.print("How many numbers will you type? ");
            N = sc.nextInt();
        }

        int[] nValues = new int[N];

        for (int i = 0; i < nValues.length; i++) {
            System.out.print("Enter a number: ");
            nValues[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("NEGATIVE NUMBERS:");
        for (int nValue : nValues) {
            if (nValue < 0) {
                System.out.println(nValue);
            }
        }
    }
}
