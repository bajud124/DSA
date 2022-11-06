// https://practice.geeksforgeeks.org/problems/kth-smallest-element/0

import java.util.PriorityQueue;

public class KthSmallestElement {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        // Create priority queue which add value in asending order
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();

        // add all value in priority queue
        for (int i = 0; i < arr.length; i++) {
            q.offer(arr[i]);
        }

        // remove (K-1) element from queue
        while (k > 1) {
            q.poll();
            k--;
        }
        return q.poll();
    }
}
