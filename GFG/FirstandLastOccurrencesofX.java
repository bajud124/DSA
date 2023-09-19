package GFG;

import java.util.ArrayList;

public class FirstandLastOccurrencesofX {
    public ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> res = new ArrayList<Long>(2);
        int start = 0;
        int end = n-1;
        int first = -1;
        while (start <= end){
            int mid = start + ((end-start)/2);
            if (arr[mid] > x) {
                end = mid - 1;
            } else if (arr[mid] < x){
                start = mid + 1;
            } else {
                if (mid - 1 >= 0 && arr[mid -1] == x){
                    end = mid-1;
                } else {
                    first = mid;
                    break;
                }
            }
        }
        res.add(0,(long)first);
        start = 0;
        end = n-1;
        int last = -1;
        while (start <= end){
            int mid = start + ((end-start)/2);
            if (arr[mid] > x) {
                end = mid - 1;
            } else if (arr[mid] < x){
                start = mid + 1;
            } else {
                if (mid + 1 < n && arr[mid + 1] == x){
                    start = mid+1;
                } else {
                    last = mid;
                    break;
                }
            }
        }
        res.add(1,(long)last);
        return res;
    }
}
