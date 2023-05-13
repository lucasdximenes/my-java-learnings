package memoryArrayLists.exercises.exercise_01.application;

import memoryArrayLists.exercises.exercise_01.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int employeesToRegister = in.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < employeesToRegister; i++) {
            System.out.printf("Employee #%d%n", i + 1);
            System.out.print("Id: ");

            int id = in.nextInt();

            while (getEmployeeById(employees, id) != null) {
                System.out.println("This id is already in use, type another one");
                System.out.print("Another id: ");
                id = in.nextInt();
            }

            System.out.print("Name: ");
            in.nextLine();
            String name = in.nextLine();

            System.out.print("Salary: ");
            double salary = in.nextDouble();

            employees.add(new Employee(id, name, salary));
            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = in.nextInt();

        Employee employee = getEmployeeById(employees, id);
        if (employee != null) {
            System.out.print("Enter the percentage: ");
            double percentage = in.nextDouble();
            in.close();
            employee.increaseSalary(percentage);
        } else {
            System.out.println("This id does not exist!");
        }
        System.out.println();

        System.out.println("List of employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    public static Employee getEmployeeById(List<Employee> employees, int id) {
        return employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
    }
}
