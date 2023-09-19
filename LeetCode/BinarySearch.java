package LeetCode;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end-start)/2;
        // if (nums.length == 1 && nums[0] == target){
        //     return 0;
        // }
        while (start <= end){
            if (nums[mid] == target){
                return mid;
            }
            if (nums[mid] > target){
                end = mid-1;
            } else {
                start = mid+1;
            }
            mid = start + (end-start)/2;
        }
        return -1;
    }
}
