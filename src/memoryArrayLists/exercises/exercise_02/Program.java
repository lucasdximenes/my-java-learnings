package memoryArrayLists.exercises.exercise_02;

import java.util.Scanner;

public class Program {
    /*
    * Write a program to read an integer N and a matrix of
    * order N containing integer numbers. Then show the diagonal
    * main and the number of negative values of the matrix.
    *
    * | Input Sample | Output sample        |
    * |--------------|----------------------|
    * | 3            |                      |
    * | 5 -3 10      | Main diagonal:       |
    * | 15 8 2       | 5 8 -4               |
    * | 7 9 -4       | Negative numbers = 2 |
    *
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] matrixN =  new int[N][N];
        int negativeNumbers = 0;

        // rows
        for (int i = 0; i < N; i++) {
            // columns
            for (int j = 0; j < N; j++) {
                // insert values
                matrixN[i][j] = sc.nextInt();
                if (matrixN[i][j] < 0) {
                    negativeNumbers++; // += 1
                }
            }
        }
        sc.close();
        
        System.out.println("Main diagonal:");
        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", matrixN[i][i]);
        }
        System.out.println();

        System.out.println("Negative numbers = " + negativeNumbers);
    }
}
