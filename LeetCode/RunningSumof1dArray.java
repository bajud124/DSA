// https://leetcode.com/problems/running-sum-of-1d-array/#:~:text=We%20define%20a%20running%20sum,2%2B3%2B4%5D.
package LeetCode;

public class RunningSumof1dArray {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            // Add sum to current element
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
