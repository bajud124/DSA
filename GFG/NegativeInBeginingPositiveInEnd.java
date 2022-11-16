// https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/
public class NegativeInBeginingPositiveInEnd {
    public static void main(String[] args) {
        int[] arr = { 1, 2, -4, -5, 2, -7, 3, 2, -6, -8, -9, 3, 2, 1 };
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            // if number is negative increase low index
            if (arr[low] < 0)
                low++;
            // if number is not negative swap with high index and decrease high index
            else
                swap(arr, low, high--);
        }
        // print array
        for (int e : arr)
            System.out.println(e + " ");
    }

    public static void swap(int[] arr, int s, int d) {
        int temp = arr[s];
        arr[s] = arr[d];
        arr[d] = temp;
    }
}
