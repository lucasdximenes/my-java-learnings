package repetitiveStructures.forLoop;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        // for loop:
        /*
        * For loop:
        * for (<init value>;<condition to stop>;<increment condition>) {
        *   <commands>
        * }
        * basically for loop iterates over while a condition is true
        * but this condition will be updated every iteration (previously known value), different
        * from the `while` loop which will only be updated if the condition
        * is updated inside the loop (if the value is not previously known)
        * */

        // ex #1:
        /*
        * Create a program that reads an integer `N`, and then reads N integer numbers
        * at the end, shows the sum of N integers read
        * */
        Scanner sc = new Scanner(System.in);

        System.out.println("Example #1");
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i += 1) {
            //it could be `i++` which is the same, the difference is i++ ==> i += 1 => i = i + 1
            //But you might need more value each iteration, and i += <value> might be more useful
            // i+= 2 // i += 3 // ...
            int X = sc.nextInt();
            sum += X;
        }

        System.out.println("Sum: " + sum);

        sc.close();

        // Example #2
        System.out.println("Example #2");
        for (int i = 0; i < 5; i++) { // Can be a decrement loop: (int i = 5; i > 0; i--) {} // i -= 1
            System.out.println("i value = " + i);
        }

        // Example #3
        System.out.println("Example #3");
        for (int i = 5; i > 0 ; i--) {
            System.out.println("i value = " + i);
        }
    }
}
