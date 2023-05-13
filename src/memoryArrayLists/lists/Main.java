package memoryArrayLists.lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        * List is a data structure:
        * - Homogeneous (same type of data): [1, 2, 3, 4, 5] -> int list
        * - Ordered (Elements can be accessed by index): [1, 2, 3, 4, 5] -> index 0 = 1, ...
        * - Dynamic (Size is not fixed, it's elements are allocated on demand): list.add(6) -> [1, 2, 3, 4, 5, 6]
        * /\ -> Different from arrays, which are static: int[] array = new int[5]; array[5] = 6; -> Error (IndexOutOfBounds)
        * Each element occupies a position in the list, which is called index.
        * */
        /*
        * `List` is an interface, so it can't be instantiated.
        * /\ - class ArrayList<E> implements List<E> {...}
        *  Classes that implement `List` interface:
        * - ArrayList (Most used) -> use dynamic array to store elements
        * /\ - dynamic array: array that grows as needed
        * - LinkedList -> use doubly linked list to store elements
        * /\ - doubly linked list: each element has a reference (pointer) to the previous and next element
        * */
        /*
        * Benefits of using `List` interface:
        * - Flexibility
        * - Powerful methods:
        * /\ - add, remove, contains, indexOf, size, isEmpty, clear, get, set, ...
        * */
        /*
        * Disadvantages of using `List` interface:
        * - Slower than arrays (because of the overhead of using dynamic arrays)
        * - More memory consumption (because of the overhead of using dynamic arrays)
        * */
        // ================================================================================================
        /*
        * Syntax:
        * - List<Type> list = new ArrayList<>();
        * `<>` -> Generics (Type parameter)
        * /\ - Type parameter: type of the elements that the list will store
        * basically, it's a way to pass a type as a parameter to a class or interface
        * in this case, we're passing the type of the elements that the list will store
        *
        * The `List` interface generic type only accepts reference types (Wrapper classes and String)
        * /\ - List<int> list = new ArrayList<>(); -> Error (Primitive type)
        * /\ - List<Integer> list = new ArrayList<>(); -> OK (Wrapper class)
        *
        * new `ArrayList<>()` -> Constructor
        * /\ - ArrayList is a class that implements `List` interface
        * (Polymorphism) -> we can use the `List` interface as a type to reference an object of the `ArrayList` class
        * We don't need to pass the type parameter to the `ArrayList` constructor,
        *  because it's already defined in the `List` interface
        * */

        List<Integer> list = new ArrayList<>();

        list.add(3); // add element to the end of the list
        list.add(4);
        list.add(1);
        list.add(2, 2); // overload: add element to a specific position in the list (index : element)

        System.out.println(list.size()); // .size() -> returns the number of elements in the list

        list.remove(2); // remove element from the list (index)
        list.remove(Integer.valueOf(3)); // remove element from the list (element)
        // /\ - Note: if we pass an int as a parameter, it will be interpreted as an index (not as an element)
        // /\ - Because of that, we need to pass an Integer object (Wrapper class) to remove an element from the list

        for (Integer number : list) {
            System.out.println(number);
        }

        System.out.println("--------------------------------");

        List<String> names = new ArrayList<>();
        names.add("Lucas");
        names.add("Ximenes");
        names.add("Jimmy");

        for (String name : names) {
            System.out.println(name);
        }

        names.removeIf(name -> name.charAt(0) == 'L');
        // /\ - removeIf() -> remove elements from the list that match the condition
        // /\ - Note: we can use lambda expressions to pass the condition as a parameter
        // /\ this lambda expression is equivalent to:
        // /\ - names.removeIf(new Predicate<String>() {
        // /\     @Override
        // /\     public boolean test(String name) {
        // /\         return name.charAt(0) == 'L';
        // /\     }
        // /\ });
        // /\ - Predicate is a functional interface that represents a condition that returns a boolean value
        // /\ Remove all names that start with 'L'
        // `removeIf()` receive a predicate (is a lambda expression that returns a boolean value) and
        // elements that match the condition (returns true) will be removed from the list

        System.out.println("--------------------------------");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("--------------------------------");

        System.out.printf("Index of 'Jimmy' is %d%n", names.indexOf("Jimmy"));
        // /\ - indexOf() -> returns the index of the first occurrence of the element in the list
        // if `indexOf()` doesn't find the element in the list, it returns -1

        System.out.println("--------------------------------");

        names.add("John");
        names.add("Alex");
        names.add("Ana");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("--------------------------------");
        System.out.println("Only names that start with 'A':");

        List<String> namesThatStartWithA = names.stream().filter(name -> name.charAt(0) == 'A').toList();
        // /\ - stream() -> returns a stream of elements from the list
        // stream is a sequence of elements that supports sequential and parallel aggregate operations
        // an abstraction of this concept is the pipeline of operations (filter, map, reduce, ...)
        // each element of the stream is processed by the operations in the pipeline
        // /\ - filter() -> returns a stream of elements that match the condition (returns true)
        // filter() receives a predicate (is a lambda expression that returns a boolean value)
        // /\ - toList() -> returns a list of elements from the stream (collects the elements of the stream)
        // we can use the `toList()` method to collect the elements of the stream and store them in a list
        // when we use the `stream()` method, the elements of the list are not modified
        // but the type of the elements of the stream is changed to `Stream<String>` (Stream of Strings)
        // because of that, we need to use the `toList()` method to collect the elements of the stream and store them in a list
        // That is, every element goes through the pipeline of operations and the result is stored in a list

        for (String s : namesThatStartWithA) {
            System.out.println(s);
        }

        System.out.println("--------------------------------");
        System.out.println("Get first name that starts with 'A':");

        String result = names.stream().filter(name -> name.charAt(0) == 'A').findFirst().orElse("Not found");
        // /\ - findFirst() -> returns the first element of the stream (returns an Optional)
        // /\ - orElse() -> returns the value of the Optional if it's not empty, otherwise
        // returns the value passed as a parameter
        // /\ - Optional is a container object that may or may not contain a non-null value
        // - `findFirst()` Will return an element if it finds one, and stream will stop
        // because stream uses lazy evaluation (it only evaluates the elements that are necessary) and
        // because of that, it will only evaluate the first element of the stream and
        // if it matches the condition, it will return it and stop the stream but not close it

        System.out.println(result);
    }
}
