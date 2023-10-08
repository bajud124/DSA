// https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
package DSA450;

public class Array3_Sort012 {
    public static void sort012(int a[], int n)
    {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int value : a) {
            if (value == 0) {
                count0++;
            } 
            else if (value == 1) {
                count1++;
            }
            else if (value == 2) {
                count2++;
            }
            
        }
        int index = 0;
        while(count0 > 0) {
            a[index++] = 0;
            count0--;
        }
        while(count1 > 0) {
            a[index++] = 1;
            count1--;
        }
        while(count2 > 0) {
            a[index++] = 2;
            count2--;
        }
    }
}
