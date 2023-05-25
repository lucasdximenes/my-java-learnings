# Java enumeration and composition

---

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

---

## Design

Before `composition` is good to know about classes categories:

**Example:**

1. **_Views_**:
    - View classes are responsible for presenting data to the user. They handle the user interface, displaying information and responding to input events. View classes often interact with controllers to fetch or update the displayed data.

2. **_Controllers_**:
   - Controller classes manage the coordination and control logic of the system. They receive user inputs from the views, interpret those inputs, and coordinate appropriate actions. Controllers also interact with services and entities to fetch or update data.

3. **_Services_**:
   - Service classes provide specific functionalities for the system. They encapsulate business logic and operations that do not easily fit into a single entity or controller. Services are often used to perform complex tasks such as calculations, external integrations, or data processing.

4. **_Entities_**:
   - Entity classes represent the core business objects of the system. They encapsulate the data and behavior associated with these entities. Entities typically correspond to domain concepts of the problem, such as customers, orders, products, etc. They may contain methods to manipulate their own data and relate to other entities.

5. **_Repositories_**:
   - Repository classes provide an abstraction layer for data persistence. They are responsible for retrieving, storing, and querying entity objects in a storage system such as a database. Repositories encapsulate the data access logic, allowing other parts of the system to interact with entities independently of the persistence mechanism.

These class categories help organize and structure an object-oriented system, enabling a clear separation of responsibilities and facilitating code maintenance, reuse, and evolution.

---

## Composition

Composition is a way to create classes that are composed of other classes or collections. It represents a "has a" relationship.

Benefits of composition:
- Code reuse (composition is more flexible than inheritance)
- Design flexibility

**Example:**

```java
public class Engine {
    private String type;
    private int power;
    
    // ...
}

public class Car {
    private String model;
    private Engine engine;
    
    // ...
}
```

This example shows that the class `Car` **_has a_** `Engine` (composition).