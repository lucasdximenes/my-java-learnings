# Java enumeration and composition

## Enumeration

Enumeration is a special type of class that represents a group of constants (unchangeable variables, like final variables).

To create an enumeration, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters:
> Example of restaurant orders

```java
package entities.enums;

public enum OrderStatus {
    PENDING_PAYMENT,
    PROCESSING,
    SHIPPED,
    DELIVERED
} // This is an enumeration
```

```java
package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
    private Integer id;
    private Date moment;
    private OrderStatus status; // Here we use the enumeration
    // /\ We use the enumeration here to represent the status of the order
    // (Pending payment, Processing, Shipped, Delivered)
    
    // ...
}
```

The `UML` diagram for enumeration is:
`<<enumeration>>` or `<<enum>>` (in the top of the class)


