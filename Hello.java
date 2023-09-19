
// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class Hello {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {4,3,11};
        int [] res = s.maxSlidingWindow(nums, 3);
        System.out.println(res);
    }
}

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 1) {
            return nums;
        }
        int[] res = new int[nums.length - k + 1];
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(nums[0]);
        for (int i = 1; i < k; i++) {
            if (dq.peekLast() <= nums[i]) {
                if (dq.peekLast() < nums[i])
                    dq.pollLast();
                dq.offerLast(nums[i]);
            } else {
                dq.offerLast(nums[i]);
            }
        }
        int i = 0;
        res[i++] = dq.peekFirst();
        for (int l = 0, r = k; r < nums.length; l++, r++) {
            if (dq.peekFirst() == nums[l]) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && dq.peekLast() < nums[r]) {
                dq.pollLast();
            }
            dq.offerLast(nums[r]);
            res[i++] = dq.peekFirst();
        }
        return res;
    }
}