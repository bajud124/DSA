package LeetCode;

public class MedianTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length+nums2.length];
        int i=0;
        int j =0;
        int k = 0;
        while (k < nums1.length+nums2.length){
            if (i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
             res[k] = nums1[i];
                i++;
                k++;
            } else {
                res[k] = nums2[j];
                j++;
                k++;
            }
            } else {
                if (i == nums1.length){
                    while (j < nums2.length){
                        res[k] = nums2[j];
                        j++;
                        k++;
                    }
                }
                if (j == nums2.length){
                    while (i < nums1.length){
                        res[k] = nums1[i];
                        i++;
                        k++;
                    }
                }
            }
        }
        if (res.length %2 == 0 ){
            return (double) res[(res.length/2)-1] + ((double)(res[(res.length/2)] - res[(res.length/2)-1])/2);
        } else {
            return (double)res[(res.length/2)];
        }
    }
}
