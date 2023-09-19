package InterviewBit.Array;
import java.util.ArrayList;

public class MoveZeros {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int loopTo = A.size();
        int index = 0;
        while (index < loopTo) {
            if (A.get(index) == 0) {
                A.remove(index);
                A.add(0);
                loopTo--;
            } else {
                index++;
            }
        }
        return A;
    }
}
