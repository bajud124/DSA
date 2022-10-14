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
