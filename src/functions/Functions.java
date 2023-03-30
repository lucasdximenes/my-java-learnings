package functions;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        // `main` is the entrypoint of a java class, if program is executable, obligatory have `main` function
        /*
        * Functions:
        * In OOP (Java / class) => Functions are called `methods`
        * <type_that_function_return> someFunc(<<type> parameters>) {
        *   <commands>
            return <something> // this return something
        * }
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        showResult(biggestNum(x, y, z));

        sc.close();
    }
    //Example:
    // public = Can call method/attribute in other classes
    // static = can use the method/attribute without new object
    public static int biggestNum(int x, int y, int z) {
        int biggestNum;
        if (x > y && x > z) {
            biggestNum = x;
        } else if (y > z) {
            biggestNum = y;
        } else {
            biggestNum = z;
        }
        return biggestNum;
    }
    // void => return nothing
    public static void showResult(int value) {
        System.out.println("Higher: " + value);
    }
}
