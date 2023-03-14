package sequentialStructure.exercises;

import java.util.Scanner;

public class exercise_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println("X = " + (A + B));

        sc.close();
    }
}
