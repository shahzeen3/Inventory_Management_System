import java.util.Scanner;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductInventory inventory = new ProductInventory();

        while (true) {
            System.out.println("\n===== Inventory Management System =====");
            System.out.println("1. Add a new product");
            System.out.println("2. Remove a product");
            System.out.println("3. Update quantity of a product");
            System.out.println("4. Display details of a product");
            System.out.println("5. Display details of all products");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product ID: ");
                    int productId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    inventory.addProduct(new Product(productId, productName, price, quantity));
                    break;
                case 2:
                    System.out.print("Enter product ID to remove: ");
                    int removeId = scanner.nextInt();
                    inventory.removeProduct(removeId);
                    break;
                case 3:
                    System.out.print("Enter product ID to update quantity: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();
                    inventory.updateQuantity(updateId, newQuantity);
                    break;
                case 4:
                    System.out.print("Enter product ID to display details: ");
                    int displayId = scanner.nextInt();
                    inventory.displayProduct(displayId);
                    break;
                case 5:
                    inventory.displayAllProducts();
                    break;
                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}