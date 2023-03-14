package sequentialStructure.exercises;

import java.util.Scanner;

public class exercise_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();
        double PI = 3.14159;
        double circleArea = PI * Math.pow(R, 2);

        System.out.printf("A=%.4f%n", circleArea);

        sc.close();
    }
}
