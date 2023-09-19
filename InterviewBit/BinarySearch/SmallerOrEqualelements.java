package InterviewBit.BinarySearch;

public class SmallerOrEqualelements {
    public int solve(int[] A, int B) {
        int start = 0;
        int end = A.length-1;
        if (A[end]<B){
            return A.length;
        }
        while(start<=end){
            int mid = start + ((end-start)/2);
            if (A[mid] == B){
                if(mid+1<A.length && A[mid+1]>B){
                    return mid+1;
                }
                start = mid+1;
            } else if (A[mid] < B){
                if(mid+1<A.length && A[mid+1]>B){
                    return mid+1;
                }
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return 0;
    }
}
