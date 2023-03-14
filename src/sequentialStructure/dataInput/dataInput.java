package sequentialStructure.dataInput;

import java.util.Scanner;

public class dataInput {
    public static void main(String[] args) {
        /*
         *  To do a data entry, we need a `Scanner` object:
         *
         *  import java.util.Scanner;
         *  Scanner sc = new Scanner(System.in);
         *
         *  And when we no longer need the `Scanner`, we need to close the object:
         *
         *  sc.close();
         * */

        Scanner sc = new Scanner(System.in);

        // ==========================================
        /*

        System.out.println("Type your name:");
        String X = sc.next(); // => returns a `String`and read only one "token"

        System.out.println("Type your age");
        int age = sc.nextInt(); // => returns a `int`
        // => This get a first letter of string, because a string it's a array of char, and index 0 is the first letter;
        // for example, if we type in terminal `lucas x` in same line => this is an error, because sc.next will read `lucas` and go to next `sc`
        // and `sc.nextInt` will read `x` and throw an error because x isn't a integer
        // but if we type `lucas 10` => all will be good
        // `sc.next` => 'lucas'
        // `sc.nextInt` => 10

        System.out.println("Type some double value");
        double y = sc.nextDouble(); // => nextDouble get a locale => US .0 / BR ,0 ...
        System.out.println("Type some word");
        char firstChar = sc.next().charAt(0);

        System.out.println("You typed this: " + X);
        System.out.println("Your age is: " + age);
        System.out.println("double value: " + y);
        System.out.println("first char: " + firstChar);

         */

        // ==========================================

        // To read all line, we have sc.nextLine(); => this will read until `next line` / `break line`
        /*
        System.out.println("Type some text");
        String someText1 = sc.nextLine();
        System.out.println("Type other text");
        String someText2 = sc.nextLine();

        System.out.println("TYPED TEXTS:");
        System.out.printf("Text 1: %s%n", someText1);
        System.out.printf("Text 1: %s%n", someText2);

         */

        // ==========================================
        // pending break lines:
        int someNumber;
        System.out.println("Type some number");
        someNumber = sc.nextInt(); // => Here are one problem, if we type a number and hit `enter/breakline`:
        // the "/n"(break line) will be pending "Character"
        System.out.println("Type some text");
        String someText1 = sc.nextLine(); // => and here, `nextLine` will consume the `/n`
        System.out.println("Type other text");
        String someText2 = sc.nextLine(); // => and here will be normal

        System.out.println("TYPED TEXTS:");
        System.out.printf("Text 1: %s%n", someText1);
        System.out.printf("Text 2: %s%n", someText2);
        System.out.printf("Number 1: %d%n", someNumber);

        /*
        * Type some number
        * 1
        * Type some text => here are the pending breakline
        * Type other text
        * some other text
        * TYPED TEXTS:
        * Text 1: => here are the pending breakline
        * Text 2: some other text
        * Number 1: 1
        * */

        // => To solve this, we can ad a sc.nextLine() to consume `/n` after nextInt();

        sc.close();
    }
}
