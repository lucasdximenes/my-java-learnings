# Java Boxing, Unboxing, and Wrapper Classes

---

In Java, data types can be divided into two categories: primitive types and reference types. Primitive types are basic
data types such as int, float, double, etc. Reference types are objects created from classes.

Java provides a mechanism to convert between primitive types and reference types. This mechanism is known as boxing and
unboxing. Boxing is the process of converting a primitive type to its corresponding wrapper class, while unboxing is the
process of converting a wrapper class to its corresponding primitive type.

---

## Boxing

Boxing is the process of converting a primitive type to its corresponding wrapper class. For example, int can be boxed
to Integer, float can be boxed to Float, etc. Boxing is done automatically by the Java compiler when required. For
example:

```java
public class Main {
    public static void main(String[] args) {
        int i = 10;
        Integer integer = i; // Boxing
        System.out.println(integer);
    }
}
```

In the above example, the Java compiler automatically boxes the int value of 10 to an Integer object.

---

## Unboxing

Unboxing is the process of converting a wrapper class to its corresponding primitive type. For example, Integer can be
unboxed to int, Float can be unboxed to float, etc. Unboxing is also done automatically by the Java compiler when
required. For example:

```java
public class Main {
    public static void main(String[] args) {
        Integer i = 10;
        int integer = i; // Unboxing Integer to int
    }
}
```

In the above example, the Java compiler automatically unboxes the Integer object to an int value.

---

The `boxing` and `unboxing` operations are often used when working with `collections` such as `ArrayLists`. For example:

```java
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // Boxing int to Integer
        int i = list.get(0); // Unboxing Integer to int
    }
}
```

In the above example, the `add()` method of the `ArrayList` class automatically boxes the int value of 10 to an Integer
object. The `get()` method of the `ArrayList` class automatically unboxes the Integer object to an int value.

---

## Wrapper Classes

Java provides a set of classes called wrapper classes that correspond to each primitive type. The wrapper classes are
used to convert between primitive types and reference types. The following table shows the primitive types and their
corresponding wrapper classes:

| Primitive Type | Wrapper Class |
|:---------------|:--------------|
| boolean        | Boolean       |
| byte           | Byte          |
| char           | Character     |
| short          | Short         |
| int            | Integer       |
| long           | Long          |
| float          | Float         |
| double         | Double        |

Wrapper classes provide useful methods for working with primitive types. For example, the Integer class provides methods
for converting a String to an int value, and for converting an int value to a String. Example:

```java
public class Main {
    public static void main(String[] args) {
        String s = "10";
        int i = Integer.parseInt(s); // Convert String to int
        System.out.println(i);
        String s2 = Integer.toString(i); // Convert int to String
        System.out.println(s2);
    }
}
```

In summary, boxing and unboxing are mechanisms provided by Java to convert between primitive types and reference types.
Wrapper classes are used to represent primitive types as objects, and provide useful methods for working with primitive
types.

---

## Demo:

```java
public class Product {
    public String name;
    public Double price;
    public Integer quantity;
    
    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    /*
     * When use some attribute of a class, the compiler automatically
     * unboxes the wrapper class to a primitive type. example:
     * 
     * double price = product.price; // Unboxing Double to double
     * 
     * or when use a primitive type in a wrapper class, the compiler
     * automatically boxes the primitive type to a wrapper class. example:
     * 
     * product.price = 10.0; // Boxing double to Double
     * */
}
```

---