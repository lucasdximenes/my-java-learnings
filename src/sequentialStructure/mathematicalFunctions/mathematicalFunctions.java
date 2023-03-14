package sequentialStructure.mathematicalFunctions;

public class mathematicalFunctions {
    public static void main(String[] args) {
        /*
        * ========= Some mathematical functions =========
        * Math.sqrt(x); // => Square root = Math.sqrt(25) => 5 ...
        * Math.pow(x, y) // => Exponential = Math.pow(2, 2) => 4 ...
        * Math.abs(x) // => Absolute value = Math.abs(-2) => 2 ...
        * */

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Square root of " + x + " = " + A);
        System.out.println("Square root of " + y + " = " + B);
        System.out.println("Square root of 25 = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " raised to " + y + " = " + A);
        System.out.println(x + " squared = " + B);
        System.out.println("5 squared = " + C);

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Absolute value of " + y + " = " + A);
        System.out.println("Absolute value of " + z + " = " + B);

        // ======================================================
        // e.g. bhaskara:
        double delta;
        double x1;
        double x2;
        double a = 3;
        double b = 5;
        double c = 7;
        delta = Math.pow(b, 2) - 4 * a * c;
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("Delta: " + delta);
        System.out.println("X1: " + x1);
        System.out.println("X2: " + x2);
    }
}
