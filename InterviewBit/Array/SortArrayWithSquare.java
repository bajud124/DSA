package InterviewBit.Array;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayWithSquare {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<Integer>(A.size());
        for (int i = 0; i < A.size(); i++) {
            result.add(A.get(i) * A.get(i));
        }
        Collections.sort(result);
        return result;
    }    
}
