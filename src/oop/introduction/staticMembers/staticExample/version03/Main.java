package oop.introduction.staticMembers.staticExample.version03;

import oop.introduction.staticMembers.staticExample.version03.util.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);
        /*
        * We don't need a instance of the class `Calculator` to use the function
        * `circumference` and `volume` because they are static and can be accessed
        * only by the class name
        * */
        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);
    }
}
