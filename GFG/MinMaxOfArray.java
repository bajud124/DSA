//https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
package GFG;

public class MinMaxOfArray {
    public static void main(String[] args) {
        int arr[] = { 1000, 11, 445, 1, 330, 3000 };
        int arr_size = 6;
        MinMaxPair minmax = getMinMax(arr, arr_size);
        System.out.println("Minimun value from array is: " + minmax.min);
        System.out.println("Maximun value from array is: " + minmax.max);
    }

    public static MinMaxPair getMinMax(int[] arr, int array_size) {
        MinMaxPair pair = new MinMaxPair();
        pair.min = pair.max = arr[0];
        for (int i = 0; i < array_size; i++) {
            // condition check for get minimum value
            if (arr[i] < pair.min) {
                pair.min = arr[i];
            }

            // condition check for maximum value
            if (arr[i] > pair.max) {
                pair.max = arr[i];
            }
        }
        return pair;
    }
}

class MinMaxPair {
    int min;
    int max;
}