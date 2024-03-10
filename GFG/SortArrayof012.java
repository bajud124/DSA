// https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
package GFG;

public class SortArrayof012 {
    public void sort012(int a[], int n)
    {
        // index for current element
        int index = 0;
        // index for value zero
        int i_0 = 0;
        // index for value two
        int i_2 = n-1;
        // loop until index is not match with two value index
        while (index <= i_2) {
            // if current value is zero then replace with zero index
            // increase zero index value
            // increase index value
            if (a[index] == 0) {
                swap(a, i_0,index);
                i_0++;
                index++;
            } 
            // current value is two2 then replace with two index value
            // decrease two index value
            else if (a[index] == 2) {
                swap(a,index,i_2);
                // if replaced value is zero then replace with zero index 
                // incrrease zero index value
                // increase index value
                if (a[index] == 0){
                    swap(a, i_0,index);
                    i_0++;
                    index++;
                }
                i_2--;
            } 
            // if value is one then increase index value
            else {
                index++;
            }
        }
    }
    
    // swap function which swap value of given two index
    public void swap (int a[], int s, int d) {
        int temp = a[s];
        a[s] = a[d];
        a[d] = temp;
    }    
}
