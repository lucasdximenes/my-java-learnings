package oop.inheritanceAndPolymorphism.content.inheritanceExample.application;

import oop.inheritanceAndPolymorphism.content.inheritanceExample.entities.BusinessAccount;

public class Program {
    public static void main(String[] args) {
        BusinessAccount account = new BusinessAccount(8010, "Bob Brown", 0.0, 500.0);

        System.out.println(account.getBalance()); // 0.0
        /*
        * The `account` object is an instance of the `BusinessAccount` class.
        * The `BusinessAccount` class is a subclass of the `Account` class.
        * And we can use all the methods and fields from the `Account` class in the `BusinessAccount` class.
        * */
    }
}
