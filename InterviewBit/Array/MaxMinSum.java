package InterviewBit.Array;
import java.util.ArrayList;

public class MaxMinSum {
    public int solve(ArrayList<Integer> A) {
        int min = A.get(0);
        int max = A.get(0);
        for (int i=0;i<A.size();i++) {
            if(max < A.get(i)) {
                max = A.get(i);
            }
            if(min > A.get(i)){
                min = A.get(i);
            }
        }
        return min+max;
    }
}
