# MyLinkedList Java Project

Welcome to the MyLinkedList Java Project, a flexible and efficient implementation of a linked list in Java. This project provides a feature-rich linked list structure for managing elements, offering functionalities like adding, removing, traversing, and checking for the existence of items.

## Table of Contents

- [Usage](#usage)
- [Methods](#methods)
- [Contributing](#contributing)
- [License](#license)

## Usage

You can use the MyLinkedList class in your Java projects by including it in your codebase. Here's a basic example:

```java
public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myList = new MyLinkedList<>();

        // Add items to the list
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        // Check if the list contains an item
        System.out.println("Contains 'Banana': " + myList.contains("Banana"));

        // Remove an item from the list
        myList.remove("Apple");

        // Get the size of the list
        System.out.println("Size of the list: " + myList.size());

        // Traverse and print the list
        System.out.println("List items:");
        myList.listTraverse();
    }
}
```

## Methods

- `clear()`: Clears the list.
- `isEmpty()`: Checks if the list is empty.
- `size()`: Returns the size of the list.
- `add(E item)`: Adds an item to the list.
- `remove(E item)`: Removes a specified item from the list.
- `remove(int index)`: Removes the item at the specified index from the list.
- `listTraverse()`: Traverses and prints the items in the list.
- `contains(E key)`: Checks if the list contains a specified item.
- `get(int index)`: Returns the item at the specified index.

## Contributing

If you have any ideas for improvements or new features, feel free to contribute! Fork the repository, make your changes, and submit a pull request. Your input is highly appreciated.

## License

This project is licensed under the [MIT License](LICENSE). Feel free to use, modify, and distribute it as needed.
