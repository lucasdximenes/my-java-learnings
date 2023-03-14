package sequentialStructure.dataProcessing;

public class dataProcessing {
    public static void main(String[] args) {
        /*
         * Attribuition command:
         * Syntax: <variable> = <value>
         * */

        // examples:
        int x, y;
        double z;
        x = 10;
        y = 20;
        z = x * y;
        System.out.println(z); // 200.0 => because z is `double` and java "parses" to float value;
        // ==================================

        double b, B, h, area;
        /*
         * it's a good practice to `double` values, use `.0`
         * and for `float` values use `f`
         * double a = 2.0;
         * float b = 2f;
         * */

        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b + B) / 2.0 * h;
        System.out.println(area);

        // ==================================
        // Casting example #1:
        int k, l;
        double result;

        k = 5;
        l = 2;
        // result = k / l;
        // => should be 2.5 but the k and l are integer (integer division)
        // and can't be floating number, and result will be 2.0 because result is double
        // to avoid this, we need explicit casting => result = (float) k / l
        result = (double) k / l; // => here, we are casting the integers variables to `double` variables
        System.out.println(result);

        // ==================================
        // Casting example #2:
        double newA;
        int newB;

        newA = 5.0;
        // newB = newA; => this is an error because cant covert double by int implicit
        // if we want to convert, whithout worrying about lose information
        // we can cast value:
        newB = (int) newA;
        System.out.println(newB); // => 5

        // ==================================
    }
}
