// https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
package DSA450;

import java.util.ArrayList;

public class SearchSort0_FirstLastOccurrences {
    public ArrayList<Integer> find(int arr[], int n, int x)
    {
        ArrayList<Integer> res =  new ArrayList<Integer>();
        int first = GetFirstElement(arr, n, x);
        int last = GetLastElement(arr, n, x);
        res.add(first);
        res.add(last);
        return res;
    }
    
    int GetFirstElement(int arr[], int n, int x) {
        int start = 0;
        int end = n-1;
        int mid = (start + end) / 2;
        while (start <= end) {
            int value = arr[mid];
            if (x == value) {
                if ((mid - 1) >= 0 && arr[mid-1] == value) {
                    end = mid - 1;
                    mid = (start + end) / 2;    
                } else {
                    return mid;
                }
            } else if (value < x) {
                start = mid + 1;
                mid = (start + end) / 2;
            } else {
                end = mid - 1;
                mid = (start + end) / 2;
            }
        }
        return -1;
    }
    int GetLastElement(int arr[], int n, int x) {
        int start = 0;
        int end = n-1;
        int mid = (start + end) / 2;
        while (start <= end) {
            int value = arr[mid];
            if (x == value) {
                if ((mid + 1) < n && arr[mid+1] == value) {
                    start = mid + 1;
                    mid = (start + end) / 2;
                } else {
                    return mid;
                }
            } else if (value < x) {
                start = mid + 1;
                mid = (start + end) / 2;
            } else {
                end = mid - 1;
                mid = (start + end) / 2;
            }
        }
        return -1;
    }
}
