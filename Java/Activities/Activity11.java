package Activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Blue");
        hash_map.put(4, "White");
        hash_map.put(5, "Black");
        System.out.println("print the original Hashmap:" + hash_map);
        hash_map.remove(4);
        System.out.println("Print the hash map after removing 4:" + hash_map);
        if (hash_map.containsValue("Green")) {
            System.out.println("Green color exists");
        } else {
            System.out.println("Green color doen't exists");
        }
        System.out.println("Print the size of the hash_map:" + hash_map.size());
    }

}


