package Java;

import java.util.Arrays;

public class _ArrayFunction {
    public static void main(String[] args) {
        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };

        // To convert the elements as List
        System.out.println("Integer Array as List: "
                + Arrays.asList(intArr));

        // Sort Array
        // dual-pivot Quicksort on primitives.
        // Time Complexity : O(n log(n))
        Arrays.sort(intArr);

        // return index where given key is found
        System.out.println(Arrays.binarySearch(intArr, 21));

        // Fill while array with given value
        Arrays.fill(intArr, 22);
    }
}
