package oop.enumerationComposition.content.enumeration.application;

import oop.enumerationComposition.content.enumeration.entities.Order;
import oop.enumerationComposition.content.enumeration.entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Order newOrder = new Order(1, new Date(), OrderStatus.PROCESSING);

        System.out.println(newOrder);

        OrderStatus orderStatus1 = OrderStatus.PENDING_PAYMENT;
        OrderStatus orderStatus2 = OrderStatus.valueOf("SHIPPED");
        // .valueOf() is a static method that converts a string to an enumeration value
        // It's useful to convert a string to an enumeration value when reading data from a database, for example
        // If the string doesn't match any enumeration value, a runtime exception is thrown

        System.out.println(orderStatus1);
        System.out.println(orderStatus2);
    }
}
