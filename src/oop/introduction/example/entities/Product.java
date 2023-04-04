package oop.introduction.example.entities;

public class Product {
    /*
    * Every class in Java is a subclass of the class `Object`
    * The class `Object` is the root of the class hierarchy
    * and have some methods like `toString()`, `equals()`, `hashCode()`
    * - toString() => return a string representation of the object
    * - equals() => compare if two objects are equal
    * - hashCode() => return an integer number that is unique for the object
    * ... and others
    * */
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
        /*
        * `this` keyword is used to refer to the current object
        * */
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() { // Override the method `toString()` from the class `Object`
        /*
        * `toString` default implementation is:
        * return getClass().getName() + "@" + Integer.toHexString(hashCode());
        *
        * We can use `toString` to return a string representation of the object
        * */

        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }
}
