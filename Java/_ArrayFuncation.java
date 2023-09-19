package Java;

import java.util.Arrays;

public class _ArrayFuncation {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        /**
         * This will use to search index of given key from sorted array using binray search
         */
        int index = Arrays.binarySearch(numbers, 5);

        /**
         * This will sort array in ascending order 
         * Quick sort is used to sort array
         */
        Arrays.sort(numbers);

        /**
         * This will fill whole array with given value
         */
        Arrays.fill(numbers, 12);
    }
}
