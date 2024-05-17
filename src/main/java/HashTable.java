import java.util.HashMap;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> hashtable = new HashMap<>();

        // Adding key-value pairs to the hashtable
        hashtable.put("Alice", 30);
        hashtable.put("Bob", 25);
        hashtable.put("Charlie", 35);

        // Accessing values by key
        System.out.println("Alice's age: " + hashtable.get("Alice"));

        // Checking if a key exists in the hashtable
        String name = "Bob";
        if (hashtable.containsKey(name)) {
            System.out.println(name + " is in the hashtable.");
        } else {
            System.out.println(name + " is not in the hashtable.");
        }

        // Removing a key-value pair from the hashtable
        hashtable.remove("Charlie");

        // Iterating over key-value pairs in the hashtable
        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}