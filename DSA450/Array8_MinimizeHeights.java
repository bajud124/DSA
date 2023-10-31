// https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1
package DSA450;

import java.util.Arrays;

public class Array8_MinimizeHeights {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int ans = arr[n-1]-arr[0];
        int smallest = arr[0]+k;
        
        int largest = arr[n-1]-k;
        int MIN,MAX;
        
          for(int i =0; i<n-1; i++){
           
           MIN = Math.min(smallest,arr[i+1]-k);
           MAX = Math.max(largest,arr[i]+k);
           if(MIN<0){
               continue;
           }
           
           ans  = Math.min(ans,MAX-MIN);
        }
        
        return ans;
    }
}
