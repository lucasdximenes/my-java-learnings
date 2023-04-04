package oop.introduction.staticMembers.staticExample.version03.util;

public class Calculator {
    public static final double PI = 3.14159;

    public static double circumference(double radius) {
        /*
        * Because the function `circumference` is static, we can use it without
        * instance of the class `Calculator`
        * */
        return 2.0 * PI * radius;
    }
    public static double volume(double radius) {
        return (4.0 * PI * Math.pow(radius, 3)) / 3.0;
    }
}
