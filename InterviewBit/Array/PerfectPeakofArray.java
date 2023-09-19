package InterviewBit.Array;

public class PerfectPeakofArray {
    public int perfectPeak(int[] A) {
        int[] leftMin = new int[A.length];
        int[] RightMax = new int[A.length];
        int min = A[0];
        int max = A[A.length -1];
        for (int i =0;i<A.length;i++){
            if (min > A[i]){
                min = A[i];
            }
            if (max < A[A.length - i - 1]){
                max = A[A.length - i - 1];
            }
            leftMin[i] = min;
            RightMax[A.length - i - 1] = max;
        }
        for (int i = 1; i<A.length -1; i++){
            if (A[i] > leftMin[i-1] && A[i] < RightMax[i+1]){
                return 1;
            }
        }
        return 0;
    }
}
