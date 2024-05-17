import java.util.HashMap;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        Map<String, Integer> hashtable = new HashMap<>();

        hashtable.put("Alice", 30);
        hashtable.put("Bob", 25);
        hashtable.put("Charlie", 35);

        System.out.println("Alice's age: " + hashtable.get("Alice"));

        String name = "Bob";
        if (hashtable.containsKey(name)) {
            System.out.println(name + " is in the hashtable.");
        } else {
            System.out.println(name + " is not in the hashtable.");
        }

        hashtable.remove("Charlie");

        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}