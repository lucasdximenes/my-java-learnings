package oop.introduction.exercises.exercise03;

import oop.introduction.exercises.exercise03.entities.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        student.name = sc.nextLine();
        student.firstGrade = sc.nextDouble();
        student.secondGrade = sc.nextDouble();
        student.thirdGrade = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", student.totalGrade());
        student.wasApproved(60);

        sc.close();
    }
}
