package InterviewBit.Array;

import java.util.ArrayList;
import java.util.Collections;

public class NobleInteger {
    public int solve(ArrayList<Integer> A) {
        int result = -1;
        Collections.sort(A);
        for (int i=0;i<A.size();i++) {
            if ((A.get(i) == A.size() - i - 1) && (A.size() > i + 1 && A.get(i) < A.get(i + 1))) {
                result = 1;
                break;
            }
        }
        if (A.get(A.size()-1) == 0){
            result = 1;
        }
        return result;
    }
}
