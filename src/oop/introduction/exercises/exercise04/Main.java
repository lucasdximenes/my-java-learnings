package oop.introduction.exercises.exercise04;

import oop.introduction.exercises.exercise04.util.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dollarPrice, amount;

        System.out.print("What is the dollar price? ");
        dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        amount = sc.nextDouble();

        double result = CurrencyConverter.usdToBrl(dollarPrice, amount);

        System.out.printf("Amount to be paid in 'reais' = %.2f%n", result);

        sc.close();
    }
}
