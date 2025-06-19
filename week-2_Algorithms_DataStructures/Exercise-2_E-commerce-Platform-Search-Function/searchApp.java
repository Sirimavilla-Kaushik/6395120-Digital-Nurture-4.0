import java.util.Scanner;

public class searchApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Footwear"),
            new Product(3, "Watch", "Accessories"),
            new Product(4, "Camera", "Electronics")
        };
        System.out.print("Enter product name to search: ");
        String searchName = scanner.nextLine();
        // Linear Search
        System.out.println("\nLinear Search Result:");
        Product result1 = searchAlgorithms.linearSearch(products, searchName);
        System.out.println(result1 != null ? result1 : "Product not found");
        searchAlgorithms.sortProductsByName(products);
        // Binary Search
        System.out.println("\nBinary Search Result:");
        Product result2 = searchAlgorithms.binarySearch(products, searchName);
        System.out.println(result2 != null ? result2 : "Product not found");

        scanner.close();
    }
}
