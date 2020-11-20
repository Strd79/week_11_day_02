import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, String> favoriteFruits = new HashMap<String, String>();
        favoriteFruits.put("Alice", "Apple");
        favoriteFruits.put("Sarah", "Banana");
        favoriteFruits.put("Bob", "Strawberry");

        System.out.println(favoriteFruits.get("Alice"));

        favoriteFruits.put(key, value);
        // insert into hashmap
        favoriteFruits.get(key);
        // get value associated with key
        favoriteFruits.size();
        // returns size as integer
        favoriteFruits.clear();
        // clears all entries
        favoriteFruits.containsValue(value);
        // returns true is the hashmap contains the value
        favoriteFruits.remove(key);
        // removed the entry with the given key
    }
}
