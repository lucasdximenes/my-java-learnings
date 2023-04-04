package oop.introduction.oopSolution.entities;

public class Triangle {
    // Here, we have `Triangle` entity, Represented by `Triangle` class
    // This class have 3 attributes, `a`, `b` and `C`, representing the sides of the triangle
    /*
    * Attributes in OOP are called `fields`, because they are used to represent the state of an object
    * */
    public double A; // `public` keyword means that this field is accessible from other classes
    public double B;
    public double C;

    public double area() { // Here we don't need to pass any parameters, because the sides of the triangle are already stored in the fields
        // Here, we have a method that calculates the area of the triangle
        // This method is called `area`, and it is a `public` method, so it is accessible from other classes
        double p = (A + B + C) / 2;
        return Math.sqrt(p * (p - A) * (p - B) * (p - C));
    }
}
