package oop.enumerationComposition.exercises.exercise01.application;

import oop.enumerationComposition.exercises.exercise01.entities.Department;
import oop.enumerationComposition.exercises.exercise01.entities.HourContract;
import oop.enumerationComposition.exercises.exercise01.entities.Worker;
import oop.enumerationComposition.exercises.exercise01.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String department = sc.nextLine();
        Department workerDepartment = new Department(department);


        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();

        System.out.print("Level: ");
        WorkerLevel workerLevel = WorkerLevel.valueOf(sc.nextLine());

        System.out.print("Base Salary: ");
        double workerBaseSalary = sc.nextDouble();

        System.out.print("How many contracts to this worker? ");
        int workerContractQuantity = sc.nextInt();

        Worker worker = new Worker(workerName, workerLevel, workerBaseSalary, workerDepartment);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (int i = 1; i <= workerContractQuantity; i++) {
            System.out.printf("Enter contract %d data%n", i);
            sc.nextLine();
            System.out.print("Date (DD/MM/YYY): ");
            LocalDate contractDate = LocalDate.parse(sc.nextLine(), dateFormatter);
            System.out.print("Value per hour: ");
            double contractValuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int contractHours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, contractValuePerHour, contractHours);
            worker.addContract(contract);
        }

        System.out.println();
        sc.nextLine();

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String[] monthAndYearInput = sc.nextLine().split("/");
        sc.close();
        int monthToSearch = Integer.parseInt(monthAndYearInput[0]);
        int yearToSearch = Integer.parseInt(monthAndYearInput[1]);
        String searchedDate = String.join("/", monthAndYearInput);


        System.out.printf("Name: %s%n", worker.getName());
        System.out.printf("Department: %s%n", worker.getDepartment());
        System.out.printf("Income for %s: %.2f%n", searchedDate, worker.income(monthToSearch, yearToSearch));
    }
}
