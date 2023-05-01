package memoryArrayLists.arrays.exercises.arraySum;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values will each array have? ");
        int N = sc.nextInt();
        int[] arrayA = new int[N];
        int[] arrayB = new int[N];
        int[] arraySum = new int[N];

        System.out.println("Enter values from array A:");
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = sc.nextInt();
        }

        System.out.println("Enter values from array B:");
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = sc.nextInt();
        }

        // Sum arrays
        System.out.println("RESULTING ARRAY:");
        for (int i = 0; i < arraySum.length; i++) {
            arraySum[i] = arrayA[i] + arrayB[i];
            System.out.println(arraySum[i]);
        }

        sc.close();
    }
}
