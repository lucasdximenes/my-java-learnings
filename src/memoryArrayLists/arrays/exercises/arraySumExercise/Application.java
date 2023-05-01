package memoryArrayLists.arrays.exercises.arraySumExercise;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you type? ");
        int N = sc.nextInt();

        double[] nValues = new double[N];
        double sum = 0;

        for (int i = 0; i < nValues.length; i++) {
            System.out.print("Enter a number: ");
            nValues[i] = sc.nextDouble();
            sum += nValues[i];
        }

        System.out.print("VALUES = ");
        for (double number : nValues) {
            System.out.printf("%.1f ", number);
        }
        System.out.println();

        System.out.printf("SUM = %.1f%n", sum);
        double average = sum / nValues.length;
        System.out.printf("AVERAGE = %.1f%n", average);

        sc.close();
    }
}
