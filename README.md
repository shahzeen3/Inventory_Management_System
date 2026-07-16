# Inventory Management System

A simple console-based Inventory Management System built in Java, demonstrating core Object-Oriented Programming (OOP) principles and collection framework usage.

## Features

- Add new products to inventory
- Remove existing products
- Update product quantity
- Display details of a specific product
- Display details of all products
- Simple menu-driven console interface

## Tech Stack

- **Language:** Java
- **Concepts Used:**
  - Object-Oriented Programming (Encapsulation, Classes & Objects)
  - Collections Framework (`HashMap`, `ArrayList`)
  - Exception-free input handling via `Scanner`

## Project Structure

```
├── Product.java                  # Represents a single product entity
├── ProductInventory.java         # Handles inventory operations (CRUD)
└── InventoryManagementSystem.java # Main class with menu-driven console UI
```

## How It Works

- `Product` class models a product with ID, name, price, and quantity.
- `ProductInventory` class manages a collection of products using both a `HashMap` (for fast lookup by ID) and an `ArrayList` (for maintaining insertion order during display).
- `InventoryManagementSystem` provides a console menu to interact with the inventory — add, remove, update, and view products.

## How to Run

### Prerequisites
- JDK 17 or higher installed
- Verify with:
  ```bash
  java -version
  javac -version
  ```

### Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/Inventory_Management_System.git
   cd Inventory_Management_System
   ```

2. Compile all files:
   ```bash
   javac *.java
   ```

3. Run the program:
   ```bash
   java InventoryManagementSystem
   ```

4. Follow the on-screen menu to manage inventory.

## Sample Menu

```
===== Inventory Management System =====
1. Add a new product
2. Remove a product
3. Update quantity of a product
4. Display details of a product
5. Display details of all products
6. Exit
```

## Future Improvements

- Persist data using file storage or a database
- Add input validation and exception handling
- Build a GUI or web-based front end
- Add unit tests

## Author

Zee — [GitHub Profile](https://github.com/your-username)
