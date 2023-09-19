package InterviewBit.BinarySearch;

public class RotatedSortedArraySearch {
    public int search(final int[] A, int B) {
        int start = 0;
        int end = A.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (A[mid] == B){
                return mid;
            } else if (A[mid] < B) {
                if (mid + 1 <= end && A[mid+1] > A[mid] && A[end] < B){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else {
                if (mid - 1 > 0 && A[mid-1] < A[mid] && A[start] < B){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
