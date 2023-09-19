package InterviewBit.Math;

import java.util.ArrayList;
import java.util.Collections;

public class AllFactor {
    public ArrayList<Integer> allFactors(int A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=1;i<=Math.sqrt(A);i++) {
            if (A%i ==0) {
                if (A/i == i) {
                    result.add(i);
                } else {
                    result.add(i);
                    result.add(A/i);
                }
            }
        }
        Collections.sort(result);
        return result;
    }
}
