package oop.introduction.staticMembers.staticExample.version01;

import java.util.Scanner;

public class Main {
    public static final double PI = 3.14159; // `final` keyword is used to declare a constant

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", PI);

        sc.close();
    }

    public static double circumference(double radius) {
        // If this function isn't static, we can't use it in a static context
        // Because a non-static method to be used, needs an instance of the class
        // new Main().circumference(radius);
        return 2.0 * PI * radius;
    }
    public static double volume(double radius) {
        return (4.0 * PI * Math.pow(radius, 3)) / 3.0;
    }
}
