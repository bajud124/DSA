// https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
package DSA450;

public class Array7_KadanesAlgorithm {
    long maxSubarraySum(int arr[], int n){
        long curr_sum = 0;
        long max_sum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            curr_sum += arr[i];
            if(curr_sum > max_sum) {
                    max_sum = curr_sum;
                }
            if (curr_sum<0)
                curr_sum = 0;
        }
        return max_sum;
    }
}
