// https://leetcode.com/problems/find-pivot-index/
package LeetCode;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        // to take sum from left side
        int[] left_sum = new int[n];
        // to take sum from right side
        int[] right_sum = new int[n];
        // assign first and last value in sum array
        left_sum[0] = nums[0];
        right_sum[n - 1] = nums[n - 1];
        // make sum array for both from left and right
        for (int i = 1; i < n; i++) {
            left_sum[i] = nums[i] + left_sum[i - 1];
            right_sum[n - i - 1] += nums[n - i - 1] + right_sum[n - i];
        }
        // check if sum match then it's index which have both side sum have equal value
        for (int i = 0; i < n; i++) {
            if (left_sum[i] == right_sum[i]) {
                return i;
            }
        }
        // if not found then return -1
        return -1;
    }
}
