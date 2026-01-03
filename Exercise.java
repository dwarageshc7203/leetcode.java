import java.util.*;
import java.util.stream.*;

public class Exercise {
    public static void main(String[] args) {
       
        List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");

        // TODO: Print the original list
        System.out.println("Original List: " + products);
        
        // TODO: Filter names longer than 5 characters, convert to uppercase, sort, and collect into a list
        List<String> filtered = products.stream()
                                .filter(n -> n.length() > 5)
                                .map(n -> n.toUpperCase())
                                .sorted()
                                .collect(Collectors.toList());

        // TODO: Print the filtered list
        System.out.println("Filtered List: " + filtered);
    }
}
