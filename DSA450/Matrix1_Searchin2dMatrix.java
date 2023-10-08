// https://leetcode.com/problems/search-a-2d-matrix/
package DSA450;

public class Matrix1_Searchin2dMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int length = matrix[0].length;
        // found row in which targer is located
        for (int i=0; i<matrix.length; i++) {
            if (target <= matrix[i][length-1]) {
                return BinarySearch(matrix[i], target);
            }
        }
        return false;
    }

    // found targer from row in which targer is located
    public boolean BinarySearch(int[] arr, int target) {
        int start = 0; 
        int end = arr.length;
        int mid = (start + end)/2;
        while (start <= end) {
            int value = arr[mid];
            if (target == value) {
                return true;
            }
            else if (target > value) {
                start = mid+1;
                mid = (start + end) / 2;
            } else {
                end = mid-1;
                mid = (start + end) / 2;
            }
        }
        return false;
    }
}
