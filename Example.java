import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        // Using the diamond operator to infer the type
        List<String> names = new ArrayList<>();  // No need to specify <String> again

        // Adding elements to the list
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Printing the list
        for (String name : names) {
            System.out.println(name);
        }
    }
}
