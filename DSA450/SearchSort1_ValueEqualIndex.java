// https://practice.geeksforgeeks.org/problems/value-equal-to-index-value1330/1
package DSA450;

import java.util.ArrayList;

public class SearchSort1_ValueEqualIndex {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<n;i++) {
            if (arr[i] == (i+1)) {
                res.add(i+1);
            }
        }
        return res;
    }
}
