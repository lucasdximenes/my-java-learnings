package sequentialStructure.exercises;

import java.util.Scanner;

public class exercise_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int employeeId = sc.nextInt();
        int workedHours = sc.nextInt();
        double incomePerHour = sc.nextDouble();

        double salary = workedHours * incomePerHour;

        System.out.println("NUMBER = " + employeeId);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        sc.close();
    }
}
