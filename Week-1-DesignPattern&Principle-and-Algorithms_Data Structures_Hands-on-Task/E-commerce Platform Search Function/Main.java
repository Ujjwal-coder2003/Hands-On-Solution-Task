public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(001, "Car", "Vehicles"),
            new Product(002, "Shirt", "Cloth"),
            new Product(003, "Laptop", "Electronics"),
            new Product(004, "Mobile", "Electronics"),
            new Product(005, "Rice", "Grocery")
        };

        Product result1 = SearchEngine.linearSearch(products, "Laptop");
        System.out.println("Linear Search Result: " + result1);

        SearchEngine.sortByName(products); 
        Product result2 = SearchEngine.binarySearch(products, "Rice");
        System.out.println("Binary Search Result: " + result2);
    }
}
