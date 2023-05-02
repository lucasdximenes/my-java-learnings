package memoryArrayLists.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        * Arrays in Java are fixed size data structures that hold elements of the same type.
        * Arrays are indexed starting at 0.
        *
        * Syntax:
        * <data_type>[] <array_name> = new <data_type>[<array_size>];
        * <data_type>[] <array_name> = {<element_1>, <element_2>, ..., <element_n>};
        *
        * Example:
        * int[] numbersSyntaxOne = new int[5];
        * numbersSyntaxOne[0] = 1;
        * numbersSyntaxOne[1] = 2;
        * numbersSyntaxOne[2] = 3;
        * numbersSyntaxOne[3] = 4;
        * numbersSyntaxOne[4] = 5;
        * System.out.println(numbersSyntaxOne[0]); // 1
        * System.out.println(numbersSyntaxOne); // [I@1b6d3586 (memory address)
        * // To print array, can use Arrays.toString(<array_name>) // [1, 2, 3, 4, 5] -> This converts the array to a string
        * int[] numbersSyntaxTwo = {1, 2, 3, 4, 5};
        *
        * To access an element in an array, use the following syntax:
        * <array_name>[<index>];
        *
        * Example:
        * int[] numbers = {1, 2, 3, 4, 5};
        * System.out.println(numbers[0]); // 1
        *
        * To change the value of an element in an array, use the following syntax:
        * <array_name>[<index>] = <new_value>;
        *
        * Example:
        * int[] numbers = {1, 2, 3, 4, 5};
        * numbers[0] = 10;
        * System.out.println(numbers[0]); // 10
        *
        * To get the length of an array, use the following syntax:
        * <array_name>.length;
        *
        * Example:
        * int[] numbers = {1, 2, 3, 4, 5};
        * System.out.println(numbers.length); // 5
        *
        * */
        String[] cars = new String[1];
        cars[0] = "BMW";
        String[] cars2 = {"BMW", "Mercedes", "Audi"};
        System.out.println(cars[0]); // BMW
        System.out.println(cars2[1]); // Mercedes
        System.out.println(Arrays.toString(cars)); // [BMW]
        System.out.println(Arrays.toString(cars2)); // [BMW, Mercedes, Audi]

        /*
        * Foreach loop
        * foreach loops are used to iterate over arrays and other collections. They are also known as enhanced for loops.
        * for (<data_type> <variable_name> : <array_name>) {
        *  <code>
        * }
        *
        * example:
        * int[] numbers = {1, 2, 3, 4, 5};
        * for (int number : numbers) {
        *  System.out.println(number);
        * }
        * // 1 2 3 4 5
        *
        * */
    }
}
