package memoryArrayLists.lists;

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
    }
}
