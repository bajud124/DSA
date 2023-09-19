package InterviewBit.BinarySearch;

import java.util.Arrays;

public class WoodCuttingMadeEasy {
    public int solve(int[] A, int B) {
        Arrays.sort(A);
        int min = A[0];
        int max = A[A.length-1];
        int mid = min + (max-min)/2;
        int sufficientHeight = 0;
        while(min<=max) {
            if(isSufficient(A, mid, B)) {
                sufficientHeight = Math.max(sufficientHeight, mid);
                min = mid+1;
            } else {
                max = mid-1;
            }
            mid = min + (max-min)/2;
            // System.out.println("sHeight = " + sufficientHeight + " min = " + min + " max = " + max + " mid = " + mid);
        }
        return sufficientHeight;
    }
    private boolean isSufficient(int[] A, int height, int minLength) {
        long lengthSum = 0;
        for(int a : A) {
            if(a-height>=0){
                lengthSum += (a-height);
            }
        }
        return lengthSum >= minLength;
    }
}
