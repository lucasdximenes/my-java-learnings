package oop.introduction.staticMembers.staticExample.version02;

import oop.introduction.staticMembers.staticExample.version02.util.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);
        /*
        * Even though the function `circumference` is non-static, we can use it
        * because we have an instance of the class `Calculator`
        *
        * If we don't have an instance of the class `Calculator`, we can't use
        * the function `circumference` because it isn't static and to be used
        * needs an instance of the class
        * */
        double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);
    }
}
