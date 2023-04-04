package oop.introduction;

import java.util.Scanner;

public class FunctionalProgrammingSolution {
    public static void main(String[] args) {
        // Functional programming solution (./problematic.md)
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC, p, xArea, yArea;

        System.out.println("Enter the measures of triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        p = (xA + xB + xC) / 2; // here, `p` have values of triangle x
        xArea = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC)); // this is `area` of triangle `x`

        System.out.printf("Triangle X area: %.4f%n", xArea); // Format string %.4f => 4 float points/ %n => new line character

        p = (yA + yB + yC) / 2; // here, `p` have values of triangle y
        yArea = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC)); // this is `area` of triangle `y`

        System.out.printf("Triangle Y area: %.4f%n", yArea);

        if (xArea > yArea) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
