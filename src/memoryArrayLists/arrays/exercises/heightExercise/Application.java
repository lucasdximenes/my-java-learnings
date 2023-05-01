package memoryArrayLists.arrays.exercises.heightExercise;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many peoples will you type? ");
        int N = sc.nextInt();
        sc.nextLine();

        Person[] people = new Person[N];
        for (int i = 0; i < people.length; i++) {
            System.out.printf("Person data %d%n", i + 1);
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Height: ");
            double height = sc.nextDouble();
            sc.nextLine();

            people[i] = new Person(name, age, height);
        }

        double sumHeight = 0;
        double peopleUnderSixteen = 0;
        for (Person person : people) {
            sumHeight += person.getHeight();
            if (person.getAge() < 16) {
                peopleUnderSixteen++; // += 1
            }
        }

        double averageHeight = sumHeight / people.length;
        double underSixteenPercentage = (peopleUnderSixteen * 100) / people.length;

        System.out.printf("Average height %.2f%n", averageHeight);
        System.out.println("People under 16 years old: " + String.format("%.1f", underSixteenPercentage) + "%");

        for (Person person : people) {
            if (person.getAge() < 16) {
            System.out.println(person.getName());
            }
        }

        sc.close();
    }
}
