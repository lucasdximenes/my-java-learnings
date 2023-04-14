package oop.constructorsThisKeywordOverloadingEncapsulation.content.entities;

public class Product {
    /*
    * Encapsulation => is the mechanism that allows us to hide the attributes of an object
    * and only expose the methods that allow us to manipulate the attributes
    * This is a `JavaBeans` guideline => attributes should be private and methods should be public
    * The encapsulation is achieved by using the `private` modifier
    * And the methods that allow us to manipulate the attributes are called `getters` and `setters`
    * The `getters` are used to get the value of the attribute
    * The `setters` are used to set the value of the attribute
    * The object must always be in a valid state => the attributes must always be valid
    * to achieve this, we use the `setters` to set the value of the attributes and prevent
    * the user from setting invalid values
    * */
    private String name; // Here we are using the `encapsulation` to hide the attributes of the object
    public double price;
    public int quantity;

    /*
    * Constructors => methods that are called when an object is instantiated
    * They have the same name as the class and do not have a return type
    * They are used to initialize the attributes of the object
    * They are called automatically when the object is instantiated
    * */
    /*
    * Default constructor:
    * public Product() {
    *   System.out.println("Constructor called");
    * }
    * */

    public Product (String name, double price, int quantity) { // Here we are using the constructor to initialize the attributes
        this.name = name;
        /*
        * `this` is a reference to the current object (the object that called the method)
        * */
        this.price = price;
        this.quantity = quantity;
    }

    /*
    * Overloading => creating multiple constructors with different parameters
    * Basically, overloading is the same as creating multiple methods with the same name but different parameters
    * */
    public Product (String name, double price) {
        this.name = name;
        this.price = price;
        /*
        * Here we are using the `overloading` to create a constructor that receives only two parameters
        * without the `quantity` parameter
        * */
    }

    // This is a `getter` method:
    public String getName() {
        return name; // Here we are returning the value of the attribute
    }

    // This is a `setter` method:
    public void setName(String name) {
        // this.name = name; // Here we are setting the value of the attribute
        /*
        * If we want to use some validation, we can do it here
        * For example, we can check if the name is null or empty
        *
        * if (name != null && name.trim().length() > 0) {
        *   this.name = name;
        * } else {
        *   throw new IllegalArgumentException("Error: invalid name");
        * }
        * */
        if (name != null && name.trim().length() > 0) {
            this.name = name;
        }
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }
}
