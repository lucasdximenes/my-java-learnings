package oop.constructorsThisKeywordOverloadingEncapsulation.exercise.application;

import oop.constructorsThisKeywordOverloadingEncapsulation.exercise.entities.BankAccount;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.nextLine().charAt(0);
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            System.out.println();
            bankAccount = new BankAccount(accountNumber, accountHolder, initialDeposit);
        } else {
            bankAccount = new BankAccount(accountNumber, accountHolder);
        }

        System.out.println("Account data:");
        System.out.println(bankAccount);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        bankAccount.deposit(sc.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(bankAccount);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        bankAccount.withdraw(sc.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(bankAccount);

        sc.close();
    }
}
