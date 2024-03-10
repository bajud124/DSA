package Java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class _HashSet {
    public static void main(String[] args) {
        /**
         * Duplicate element is not allowed
         * You can't add duplicate element
         */

        /**
         * Declare set
         * Contain element in unorderd way
         * ALl operation perfrom in O(1)
         */
        Set<Integer> set = new HashSet<Integer>();

        /**
         * Add element in set
         */
        set.add(5);
        set.add(3);
        set.add(4);
        set.add(4);
        set.add(4);
        System.out.println(set);

        /**
         * Remove value from set
         */
        set.remove(5);

        /**
         * This will return true if set contian given value
         */
        set.contains(5);

        /**
         * This will return true if set is empty
         */
        set.isEmpty();

        /**
         * This will return size of set
         */
        set.size();

        /**
         * This will remove all element from set
         */
        set.clear();

        // ------------- Using for each loop -----------------
        // Iterating over hash set items
        for (Integer i : set)
            System.out.println(i);

        // -------------Iterator method---------------
        // Iterating over HashSet elements
        // using iterator
        Iterator<Integer> i = set.iterator();
        // Holds true till there is single element remaining
        // in the Set
        while (i.hasNext())
            // Printing the elements
            System.out.println(i.next());

        /**
         * Declare linked set
         * This will store element in order of insertion
         * Other all property remain same as HashSet
         */
        Set<Integer> linkedSet = new LinkedHashSet<>();

        /**
         * Declare tree set
         * This will store element in asending order of value
         * Other all property will remain same as HashSet
         * All operation perform in O(log(n)) time
         */
        Set<Integer> treeSet = new TreeSet<>();
    }
}
