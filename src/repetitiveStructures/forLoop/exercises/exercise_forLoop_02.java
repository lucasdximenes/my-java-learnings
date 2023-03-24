package repetitiveStructures.forLoop.exercises;

import java.util.Scanner;

public class exercise_forLoop_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int inRange = 0;
        int outRange = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num < 10 || num > 20) {
                outRange++;
            } else {
                inRange++;
            }
        }

        System.out.printf("%d in%n", inRange);
        System.out.printf("%d out%n", outRange);

        sc.close();
    }
}
