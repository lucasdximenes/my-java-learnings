package oop.enumerationComposition.exercises.exercise02.application;

import oop.enumerationComposition.exercises.exercise02.entities.Client;
import oop.enumerationComposition.exercises.exercise02.entities.Order;
import oop.enumerationComposition.exercises.exercise02.entities.OrderItem;
import oop.enumerationComposition.exercises.exercise02.entities.Product;
import oop.enumerationComposition.exercises.exercise02.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.util.Scanner;

import static oop.enumerationComposition.exercises.exercise02.entities.Order.dateFormatter;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate clientBirthDate = LocalDate.parse(sc.nextLine(), dateFormatter);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus clientOrderStatus = OrderStatus.valueOf(sc.nextLine());
        System.out.print("How many items to this order? ");
        int clientItemsQuantity = sc.nextInt();
        sc.nextLine();
        System.out.println();

        Client client = new Client(clientName, clientEmail, clientBirthDate);
        Order order = new Order(client, clientOrderStatus);

        for (int i = 1; i <= clientItemsQuantity; i++) {
            System.out.printf("Enter #%d item data:%n", i);
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();
            sc.nextLine();
            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(product, productQuantity);
            order.addItem(orderItem);
            System.out.println();
        }
        sc.close();

        System.out.println(order);
    }
}
