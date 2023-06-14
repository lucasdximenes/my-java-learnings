package oop.inheritanceAndPolymorphism.content.inheritanceExample.entities;

public class BusinessAccount extends Account{
    /*
    * extends keyword is used to indicate that this class is a subclass of another class.
    * A subclass inherits all non-private members (fields, methods, and nested classes) from its superclass.
    * Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.
    * */
    private Double loanLimit;

    public BusinessAccount() {
        super();
        /*
        * `super()` keyword is used to call the superclass constructor.
        * `superclass` is the class that is being inherited from.
        * */
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); // call the superclass constructor with 3 arguments
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0; // `balance` is protected, so it can be accessed by subclasses
            /*
            * `balance` comes from the superclass, so it's inherited.
            * basically, the subclass has a copy of the superclass' fields (except for private fields).
            * */
        }
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
}
