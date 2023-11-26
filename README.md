# Binary Search Tree (BST) Implementation

This repository contains a Java implementation of a Binary Search Tree (BST) data structure.

## Overview

A Binary Search Tree is a fundamental data structure that allows for efficient insertion, deletion, and retrieval of elements in logarithmic time complexity. This implementation provides the following functionalities:

- **Insertion:** Adding elements to the tree while maintaining the BST property.
- **Deletion:** Removing elements from the tree while preserving the BST structure.
- **Traversal:** Depth-First Search (DFS) methods to traverse the tree in pre-order, in-order, and post-order.

## Usage

To use this implementation:

1. **Clone the Repository:**
    ```bash
    git clone https://github.com/slowpoke111/binary-search-tree.git
    ```

2. **Usage in Java:**
    - Include the `BST.java` file in your Java project.
    - Create a `BST` instance and use its methods to interact with the Binary Search Tree.

    Example:
    ```java
    // Usage example
    BST<Integer> bst = new BST<>(10);
    bst.insert(5);
    bst.insert(15);
    // Perform other operations as needed
    ```

3. **Methods Available:**
    - `insert(value)`: Insert a value into the tree.
    - `has(value)`: Check if a value exists in the tree.
    - `remove(value)`: Remove a value from the tree.
    - `DFSIn()`, `DFSPre()`, `DFSPost()`: Perform in-order, pre-order, and post-order traversals, respectively.
    - `clear()`: Clear the tree.

## Contributing

Contributions are welcome! If you have any suggestions, bug fixes, or additional features to add, please feel free to open an issue or create a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
