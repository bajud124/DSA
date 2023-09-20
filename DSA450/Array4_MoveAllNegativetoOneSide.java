// https://practice.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1
package DSA450;

public class Array4_MoveAllNegativetoOneSide {
    public void segregateElements(int arr[], int n)
    {
        int length = arr.length;
        int[] negative = new int[length];
        int idx_p = 0;
        int idx_n = 0;
        for (int value: arr) {
            if(value<0) {
                negative[idx_n++] = value;
            } else {
                arr[idx_p++] = value;
            }
        }
        idx_n = 0;
        while(idx_p <length) {
            arr[idx_p++] = negative[idx_n++];
        }
    }
}
