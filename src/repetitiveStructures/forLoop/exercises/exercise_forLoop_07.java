package repetitiveStructures.forLoop.exercises;

import java.util.Scanner;

public class exercise_forLoop_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            double y = Math.pow(i, 2);
            double z = Math.pow(i, 3);

            System.out.printf("%d %.0f %.0f%n", i, y, z);
        }

        sc.close();
    }
}
