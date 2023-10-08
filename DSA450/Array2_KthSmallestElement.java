// https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
package DSA450;

import java.util.PriorityQueue;

public class Array2_KthSmallestElement {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        for (int i = 0; i < arr.length; i++) {
            q.offer(arr[i]);
        }
        while (k > 1) {
            q.poll();
            k--;
        }
        return q.poll();
    }
}
