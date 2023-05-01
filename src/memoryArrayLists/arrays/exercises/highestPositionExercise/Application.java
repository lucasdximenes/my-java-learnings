package memoryArrayLists.arrays.exercises.highestPositionExercise;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you type? ");
        int N = sc.nextInt();
        double[] numbers = new double[N];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextDouble();
        }

        int position = 0;
        double highestNum = numbers[position];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > highestNum) {
                highestNum = numbers[i];
                position = i;
            }
        }

        System.out.println("HIGHEST VALUE = " + highestNum);
        System.out.println("POSITION OF THE GREATEST VALUE = " + position);

        sc.close();
    }
}
