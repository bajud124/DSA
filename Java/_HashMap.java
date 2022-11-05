package Java;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class _HashMap {
    public static void main(String[] args) {

        /**
         * Declare HashMap with key and value pair
         * All Operation perfrom in O(1)
         */
        Map<String, Integer> numbers = new HashMap<String,Integer>();

        /**
         * Add key and value pair in HashMap
         */
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        /**
         * Get value of given key from hashMap
         */
        numbers.get("One");

        /**
         * return value if given key is present in hashMap else return default value
         */
        numbers.getOrDefault("One", 1);

        /**
         * If key is present in HalsMap then this key value is replace with new value 
         */
        numbers.put("Two", 23);

        /**
         * This will remove give key pair from HashMap
         */
        numbers.remove("Two");

        /**
         * This will insert only if given key is not present in HashMap
         */
        numbers.putIfAbsent("Four", 4);

        /**
         * This will return true if HashMap contain given key
         */
        numbers.containsKey("One");

        /**
         * This will return true if HashMap contain given value
         */
        numbers.containsValue(2);

        /**
         * This will return true is map is empty
         */
        numbers.isEmpty();

        /**
         * This will remove all set from map
         */
        numbers.clear();

        /**
         * Itrrate over HashMap to get set 
         */
        for (Map.Entry<String, Integer> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        /**
         * Itrrate over HashMap to get key 
         */
        for (String key : numbers.keySet()) {
            System.out.println(key);
        }

        /**
         * Itrate over HashMap to get value 
          */
        for (Integer value : numbers.values()) {
            System.out.println(value);
        }


        /**
         * This will store set in asending order of Key 
         * Other will same as hashMap
         * All operation perform in O(log(n)) time
         */
        Map<String, Integer> treeMap = new TreeMap<String, Integer>();
    }
}
