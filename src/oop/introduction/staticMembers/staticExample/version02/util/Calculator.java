package oop.introduction.staticMembers.staticExample.version02.util;

public class Calculator {
    public final double PI = 3.14159;

    public double circumference(double radius) {
        /*
        * This function isn't static, and to be accessed needs an instance
        * */
        return 2.0 * PI * radius;
    }
    public double volume(double radius) {
        return (4.0 * PI * Math.pow(radius, 3)) / 3.0;
    }
}
