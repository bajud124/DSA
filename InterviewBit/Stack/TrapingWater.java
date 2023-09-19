package InterviewBit.Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrapingWater {
    public int trap(final List<Integer> A) {
        int result = 0;
        ArrayList<Integer> right = GraterInRightArray(new ArrayList<Integer>(A));
        ArrayList<Integer> left = GraterInLeftArray(new ArrayList<Integer>(A));
        for (int i = 0; i < A.size(); i++) {
            int water = Math.min(right.get(i), left.get(i));
            if (water!= -1) {
                result += water - A.get(i);
            }
        }
        return result;
    }
    public ArrayList<Integer> GraterInLeftArray(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(A.get(0));
        for (int i = 1; i<A.size(); i++) {
            if (A.get(i) > result.get(i-1)) {
                result.add(A.get(i));
            } else {
                result.add(result.get(i-1));
            }
        }
        return result;
    }
    public ArrayList<Integer> GraterInRightArray(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(A.get(A.size()-1));
        for (int i = 1; i<A.size(); i++) {
            if (A.get(A.size()-1-i) > result.get(i-1)) {
                result.add(A.get(A.size()-1-i));
            } else {
                result.add(result.get(i-1));
            }
        }
        Collections.reverse(result);
        return result;    
    }
}
