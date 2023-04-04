package oop.introduction.exercises.exercise03.entities;

public class Student {
    public String name;
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;

    public double totalGrade() {
        return firstGrade + secondGrade + thirdGrade;
    }

    public void wasApproved(double minGrade) {
        if (totalGrade() >= minGrade) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", minGrade - totalGrade());
        }
    }

}
