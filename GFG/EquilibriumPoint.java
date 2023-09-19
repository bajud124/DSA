package GFG;

public class EquilibriumPoint {
    public int equilibriumPoint(long arr[], int n) {

        int sumBefor = 0;
        int sumAfter = 0;
        int end = n-1;
        for (int i =0;i<n;i++){
            if(i>end){
                return -1;
            }
            sumBefor += arr[i];
            if (i == end+1 && sumBefor == sumAfter){
                return i+1;
            }
            while (sumBefor > sumAfter){
                sumAfter += arr[end];
                end--;
            }
            if (i == end+1 && sumBefor == sumAfter){
                return i+1;
            }
        }
        return -1;
    }
}
