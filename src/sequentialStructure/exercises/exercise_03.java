package sequentialStructure.exercises;

import java.util.Scanner;

public class exercise_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        int diff = ((A * B) - (C * D));

        System.out.println("DIFERENCA = " + diff);

        sc.close();
    }
}
