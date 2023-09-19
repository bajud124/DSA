package InterviewBit.Array;

import java.util.ArrayList;

public class Segregate01Array {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (Integer i: A){
            if (i == 1) {
                result.add(i);
            } else {
                result.add(0,i);
            }
        }
        return result;
    }
}
