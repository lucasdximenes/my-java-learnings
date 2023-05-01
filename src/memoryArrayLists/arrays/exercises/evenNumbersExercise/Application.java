package memoryArrayLists.arrays.exercises.evenNumbersExercise;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you type? ");
        int N = sc.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Even numbers:");
        int quantityEvenNumbers = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                quantityEvenNumbers++;
                System.out.printf("%d ", number);
            }
        }
        System.out.println();
        System.out.printf("QUANTITY OF EVEN NUMBERS = %d%n", quantityEvenNumbers);

        sc.close();
    }
}
