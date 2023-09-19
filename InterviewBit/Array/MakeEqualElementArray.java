package InterviewBit.Array;

import java.util.ArrayList;
import java.util.Collections;

public class MakeEqualElementArray {
    public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        for (int i = 0; i < A.size(); i++) {
            if ((A.get(i)-A.get(0))%B !=0) {
                return 0;
            }
        }
        return 1;
    }    
}
