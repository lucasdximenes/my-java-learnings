package conditionalStructure.ifElse;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        //if - else:
        /*
         * if (<condition) {
         *   <commands>
         * }
         * */
        /*
         * int x = 10;
         * if (x < 5) { // `if` only executes if condition is `true`;
         *     System.out.println("X less than 5");
         * } else if (x == 10) { // `else if` execute if first condition fail, but only execute if second condition is true
         *     System.out.println("X equal 10");
         * } else { // If all conditions fails
         *     System.out.println("X greater than 5");
         * }
         * */
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();

        if (hour < 12) {
            System.out.println("Good Morning!");
        } else if (hour < 18) {
            System.out.println("Good afternoon!");
        } else {
            System.out.println("Good night!");
        }

        sc.close();
    }
}
