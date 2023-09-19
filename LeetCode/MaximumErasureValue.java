package LeetCode;
import java.util.*;
public class MaximumErasureValue {
    public int maximumUniqueSubarray(int[] nums) {
        // for collect unique integer
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxSum = 0;
        int currSum = 0;
        // loop for travse whole array 
        while (right < nums.length) {
            // check if value already present in set then perform logic behind that 
            if (set.contains(nums[right])) {
                // if present then get maxsum as per below
                maxSum = Math.max(currSum, maxSum);
                // remove element from set and also from currSum to get unique value sum 
                while (nums[left] != nums[right]) {
                    currSum -= nums[left];
                    set.remove(nums[left]);
                    left++;
                }
                // increment for same value at left side 
                // no need to remove from currsum because we have to add again at that same value 
                // which we get from right side 
                left++;
            } else {
                // if not contains in set the add in set 
                set.add(nums[right]);
                // add value in currsum for 
                currSum += nums[right];
            }
            right++;
        }
        // check after lopping get currsum is grater give that to maxSum 
        maxSum = Math.max(currSum, maxSum);
        return maxSum;
    }
}
