package oop.inheritanceAndPolymorphism.content.inheritanceExample.entities;

public class Account {
    private Integer number;
    private String holder;
    protected Double balance;
    /*
    * `protected` keyword is used to indicate that this field can only be accessed by subclasses.
    * basically, it's like `public` but only for subclasses. It's not private, but it's not public either.
    * */

    public Account() {
    };

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    };

    public void withdraw(Double amount) {
        balance -= amount;
    };

    public void deposit(Double amount) {
        balance += amount;
    };

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }
}
