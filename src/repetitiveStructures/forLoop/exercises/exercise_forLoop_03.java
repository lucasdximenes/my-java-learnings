package repetitiveStructures.forLoop.exercises;

import java.util.Scanner;

public class exercise_forLoop_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int xWeight = 2;
        int yWeight = 3;
        int zWeight = 5;

        for (int i = 0; i < N; i++) {
            float x = sc.nextFloat();
            float y = sc.nextFloat();
            float z = sc.nextFloat();

            float weightedAverage = ((x * xWeight) + (y * yWeight) + (z * zWeight)) / (xWeight + yWeight + zWeight);

            System.out.printf("%.1f%n", weightedAverage);
        }

        sc.close();
    }
}
