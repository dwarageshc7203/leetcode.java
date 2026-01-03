import java.util.*;

public class Exercise {
    
    public static void main(String[] args){
        
        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "David", "Bob");
        
        // TODO: Print the original list

        System.out.println("Original List: " + names);
        
        Set<String> renames = new LinkedHashSet<String>(names);

        // TODO: Convert the list to a LinkedHashSet to remove duplicates while preserving order

        // TODO: Print the set of unique names
        System.out.println("Unique Names:  " + renames);
        
    }

}