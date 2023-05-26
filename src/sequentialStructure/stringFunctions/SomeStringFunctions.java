package sequentialStructure.stringFunctions;

import java.util.Arrays;

public class SomeStringFunctions {
    public static void main(String[] args) {
        /*
        * format functions:
        * toLowerCase() => convert string into lowercase
        * toUpperCase() => convert string into uppercase
        * trim() => remove whitespaces at start and end of a string
        * */
        // format examples:
        System.out.println("Hello World!".toLowerCase());
        System.out.println("Hello World!".toUpperCase());
        System.out.println(" Hello World! ".trim());
        /*
        * hello world!
        * HELLO WORLD!
        * Hello World!
        * */

        // ===========================================================

        /*
        * cut-off functions:
        * substring(start, end) / (start) => cut a string based on start index - end index
        * */
        // EX's:
        System.out.println("Hello World!".substring(0, 5));
        System.out.println("Hello World!".substring(6));
        /*
        * Hello
        * World!
        * */

        // ===========================================================

        /*
        * replace functions:
        * replace(char, char) / replace(string, string) => Replace char/string to other char/string
        * '' => char
        * "" => String
        * */
        //EX's:
        System.out.println("Hello World!".replace('l', 'c')); // '' -> char
        System.out.println("Hello World!".replace("World", "Peoples")); // "" -> String
        /*
        * Hecco Worcd!
        * Hello Peoples!
        * */

        // ===========================================================

        /*
         * search functions:
         * indexOf() -> get index of first occurrences char/string
         * lastIndexOf() -> get the index of last occurrences char/string
         * */
        // EX's:
        System.out.println("Hello World!".indexOf('e')); // -> index 1
        System.out.println("Hello World!".indexOf("World")); // -> index 6
        System.out.println("Hello World!".lastIndexOf('o')); // -> index 7
        System.out.println("Hello World!".lastIndexOf('l')); // -> index 9

        // ===========================================================
        /*
        * split functions:
        * split() -> split string based on some regex or condition
        * // -> Return an array with separated occurrences
        * */
        //EX's:
        System.out.println(Arrays.toString("Hello World!".split(" ")));

        String fruits = "Apple, Banana, Grapes";
        String[] fruitsList = fruits.split(", ");
        System.out.println(Arrays.toString(fruitsList));
        /* // Arrays.toString() -> to print a string representation of array
        * [Hello, World!]
        * [Apple, Banana, Grapes]
        * */

        /*
        * StringBuilder:
        * StringBuilder() -> create a new StringBuilder
        * append() -> add a new string to StringBuilder
        * reverse() -> reverse the string
        * toString() -> convert StringBuilder to String (to print for example)
        * */

        // EX's:
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" World!");
        System.out.println(sb.toString());
        // In this case StringBuilder is simply a String
        // But in complex cases, StringBuilder is more efficient than String concatenation
        // For example:
        String fruits2 = "";
        fruits2 += "Apple";
        fruits2 += " Banana";
        fruits2 += " Grapes";
        System.out.println(fruits2);
        // In this case, String concatenation is more expensive than StringBuilder
        // Because String concatenation create a new String every time
        // But StringBuilder is mutable, so it's more efficient

        /*
        * In cases where you need to concatenate a lot of strings, use StringBuilder
        * In cases where you need to concatenate a few strings, use String concatenation
        *
        * Other complex cases is when you need to concatenate a lot of strings in a loop
        * In this case, use StringBuilder
        * for (comment c : comments) {
        *  sb.append(c + "\n"
        * }
        * return sb.toString(); // return a String with all comments
        * */
        // ===========================================================
    }
}
