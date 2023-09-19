package InterviewBit.Array;
import java.util.ArrayList;
import java.util.Collections;

public class MaximumAbsoluteDifference {
    public int maxArr(ArrayList<Integer> A) {
        int difference=0;
        ArrayList<Integer> temp = new ArrayList<Integer>(A.size());
        for (int i =0;i<A.size();i++) {
            temp.add(A.get(i)+i);
        }
        Collections.sort(temp);
        difference = Math.abs(temp.get(0) - temp.get(A.size()-1));
        temp.clear();
        for (int i =0;i<A.size();i++) {
            temp.add(A.get(i)-i);
        }
        Collections.sort(temp);
        difference = Math.max(Math.abs(temp.get(0) - temp.get(A.size()-1)),difference);
        return difference;
    }
}
