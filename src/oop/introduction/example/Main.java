package oop.introduction.example;

import oop.introduction.example.entities.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in Stock: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + product);
        /*
        * By default, the method `toString()` return a string representation of the object
        * When we print an object, the method `toString()` is called because the method `toString()` is called by default
        * */

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        product.removeProducts(sc.nextInt());

        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
