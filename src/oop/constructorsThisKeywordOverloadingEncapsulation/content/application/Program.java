package oop.constructorsThisKeywordOverloadingEncapsulation.content.application;

import oop.constructorsThisKeywordOverloadingEncapsulation.content.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        * When we instantiate an object, the constructor is called automatically
        * By default, Java provides a default constructor that does not receive any parameters
        * If we create a constructor with parameters, the default constructor is no longer provided
        * And we need to provide the parameters in the instantiation
        * */

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Quantity in Stock: ");
        int quantity = sc.nextInt();
        sc.nextLine();

        Product product = new Product(name, price, quantity); // Here we are using the constructor to initialize the attributes
        // Product product2 = new Product(name, price);
        // This is an example of `overloading` => creating multiple constructors with different parameters
        /*
        * Use the constructors to initialize the attributes of the object
        * is a good practice that makes the code more readable and organized
        * better than using the dot operator to initialize the attributes:
        * product.name = name; product.price = price; product.quantity = quantity;
        * */

        System.out.println();
        System.out.println("Product name: " + product.getName()); // Here we are using the `getter` method to get the value of the attribute
        System.out.println("Product price: " + product.price); // Here we are using the dot operator to get the value of the attribute
        /*
        * dot operator in this case works because the attribute is public
        * if the attribute is private, we need to use some method to get the value of the attribute
        * */
        System.out.println("Product quantity: " + product.quantity);

        System.out.print("Change product name: ");
        product.setName(sc.nextLine()); // Here we are using the `setter` method to set the value of the attribute
        System.out.println("Updated product name: " + product.getName());

        sc.close();
    }
}
