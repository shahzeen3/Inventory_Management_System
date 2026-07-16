import java.util.ArrayList;
import java.util.HashMap;

public class ProductInventory {
    private HashMap<Integer, Product> productMap;
    private ArrayList<Product> productList;

    public ProductInventory() {
        productMap = new HashMap<>();
        productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productMap.put(product.getProductId(), product);
        productList.add(product);
    }

    public void removeProduct(int productId) {
        Product product = productMap.remove(productId);
        if (product != null) {
            productList.remove(product);
            System.out.println("Product removed successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void updateQuantity(int productId, int quantity) {
        Product product = productMap.get(productId);
        if (product != null) {
            product.setQuantity(quantity);
            System.out.println("Quantity updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayProduct(int productId) {
        Product product = productMap.get(productId);
        if (product != null) {
            System.out.println(product);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayAllProducts() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}