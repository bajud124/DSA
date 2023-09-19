package GFG;

import java.util.ArrayList;
import java.util.Arrays;

public class SubarrayWithGivenSum {
    public ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int start = 0;
        int index = 0;
        int sum = 0;
        while(index < arr.length){
            sum = sum + arr[index];
            if (sum > s) {
                while (sum > s){
                    sum = sum - arr[start];
                    start++;
                }
            } 
            if (sum == s){
                return new ArrayList<Integer>(Arrays.asList(start+1, index+1));
            } 
            index++;
        }
        return new ArrayList<Integer>(Arrays.asList(-1, -1));
    }
}
