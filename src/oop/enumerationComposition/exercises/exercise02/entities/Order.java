package oop.enumerationComposition.exercises.exercise02.entities;

import oop.enumerationComposition.exercises.exercise02.entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    public static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private final List<OrderItem> items = new ArrayList<>();
    private final Client client;
    private final LocalDateTime moment;
    private OrderStatus status;

    public Order(Client client, OrderStatus status) {
        this.client = client;
        moment = LocalDateTime.now();
        this.status = status;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        Double total = 0.0;
        for (OrderItem item : items) {
            total += item.subTotal();
        }
        return total;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Client getClient() {
        return client;
    }

    public String getMoment() {
        return moment.format(dateTimeFormatter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY\n");
        sb.append("Order moment: ");
        sb.append(getMoment());
        sb.append("\nOrder status: ");
        sb.append(status);
        sb.append("\nClient: ");
        sb.append(client);
        sb.append("\nOrder items:\n");
        for (OrderItem item : items) {
            sb.append(item);
            sb.append("\n");
        }
        sb.append(String.format("Total price: $%.2f", total()));
        return sb.toString();
    }
}
