package memoryArrayLists.exercises.exercise_03;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
         * Make a program to read two integers M and N, and then read a matrix of M rows by N columns containing integers,
         * with repetitions possible. Then read an integer X that belongs to the array. For each occurrence of X, show the
         * values to the left, above, to the right and below X, if any, according to the example.
         *
         * Input:
         * 3 4
         * 10 8 15 12
         * 21 11 23 8
         * 14 5 13 19
         * 8
         *
         * Output:
         * Position 0,1:
         * Left: 10
         * Right: 15
         * Down: 11
         * Position 1,3:
         * Left: 23
         * Up: 12
         * Down: 19
        * */

        Scanner sc = new Scanner(System.in);

        // rows length
        int rowsM = sc.nextInt();
        // columns length
        int columnsN = sc.nextInt();

        // initialize matrix
        int[][] matrix = new int[rowsM][columnsN];

        // rows
        for (int i = 0; i < rowsM; i++) {
            // columns
            for (int j = 0; j < columnsN; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // num to get
        int getOccurrences = sc.nextInt();
        sc.close();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == getOccurrences) {
                    System.out.printf("Position %d,%d:%n", i, j);
                    // Left
                    if (j - 1 >= 0) {
                        System.out.printf("Left: %d%n", matrix[i][j - 1]);
                    }

                    // Up
                    if (i - 1 >= 0) {
                        System.out.printf("Up: %d%n", matrix[i - 1][j]);
                    }

                    // Right
                    if (j + 1 < matrix[i].length) {
                        System.out.printf("Right: %d%n", matrix[i][j + 1]);
                    }

                    // Down
                    if (i + 1 < matrix.length) {
                        System.out.printf("Down: %d%n", matrix[i + 1][j]);
                    }
                }
            }
        }
    }
}
