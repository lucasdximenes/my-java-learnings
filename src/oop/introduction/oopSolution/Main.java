package oop.introduction.oopSolution;

import oop.introduction.oopSolution.entities.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle x, y; // Here, we have 2 variables of type `Triangle`, `x` and `y`
        /*
        * The class `Triangle` is like a blueprint, and the variables `x` and `y` are like the houses built from that blueprint
        * */
        x = new Triangle(); // Here, we are creating a new `Triangle` object, and assigning it to the variable `x`
        y = new Triangle();
        /*
        * `x` is a reference variable, and `new Triangle()` is an object
        * `new` is a keyword that creates a new object in memory and returns a reference to that object
        *  we call this reference an `instance`
        * */

        double xArea, yArea;

        System.out.println("Enter the measures of triangle X: ");
        x.A = sc.nextDouble(); // Here, we are accessing the `A` field of the `x` object, and assigning it a value
        /*
        * To access some field of an object, we use the `.` operator
        * `Dot operator` is used to access fields and methods of an object
        * */
        x.B = sc.nextDouble();
        x.C = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.A = sc.nextDouble();
        y.B = sc.nextDouble();
        y.C = sc.nextDouble();

        /*
        * p = (x.A + x.B + x.C) / 2; // here, `p` have values of triangle x
        * xArea = Math.sqrt(p * (p - x.A) * (p - x.B) * (p - x.C)); // this is `area` of triangle `x`
        *
        * System.out.printf("Triangle X area: %.4f%n", xArea); // Format string %.4f => 4 float points/ %n => new line character
        *
        * p = (y.A + y.B + y.C) / 2; // here, `p` have values of triangle y
        * yArea = Math.sqrt(p * (p - y.A) * (p - y.B) * (p - y.C)); // this is `area` of triangle `y`
        *
        * System.out.printf("Triangle Y area: %.4f%n", yArea);
        *
        * before, we had to create a variable `p` to store the value of `p` of each triangle
        * and then, we had to calculate the area of each triangle
        * But this is not the best way to do it, because we have to repeat the same code for each triangle
        * and the area of triangle is a property of the triangle and not a separate entity, so it should be a method of the `Triangle` class
        * */

        xArea = x.area(); // Here, we are calling the `area` method of the `x` object (triangle)
        /*
        * This is how we call a method of an object
        * And now, we have separated the code that calculates the area of a triangle from the code that calculates the area of another triangle,
        * and we can reuse the `area` method for any other triangle, without having to rewrite the code or fill the main method with code
        * which is not related to the main purpose of the program
        * */
        yArea = y.area();

        System.out.printf("Triangle X area: %.4f%n", xArea);
        System.out.printf("Triangle Y area: %.4f%n", yArea);

        if (xArea > yArea) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
