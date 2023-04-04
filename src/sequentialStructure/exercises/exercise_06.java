package sequentialStructure.exercises;

import java.util.Scanner;

public class exercise_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();

        /*
        * a) Find the area of the right triangle that has A as its base and C as its height.
        * b) the area of the circle of radius C. (pi = 3.14159)
        * C) the area of the trapezoid that has A and B for bases and C for height.
        * d) the area of the square that has side B.
        * e) the area of the rectangle that has sides A and B.
        * */

        float PI = 3.14159f;
        float triangleArea = (A * C) / 2;
        double circleArea = PI * Math.pow(C, 2);
        float trapezoidArea = ((A + B) / 2) * C;
        double squareArea = Math.pow(B, 2);
        float rectangleArea = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triangleArea);
        System.out.printf("CIRCULO: %.3f%n", circleArea);
        System.out.printf("TRAPEZIO: %.3f%n", trapezoidArea);
        System.out.printf("QUADRADO: %.3f%n", squareArea);
        System.out.printf("RETANGULO: %.3f%n", rectangleArea);

        sc.close();
    }
}
