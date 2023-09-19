package InterviewBit.Array;
import java.util.ArrayList;

public class MinStepInfiniteGrid {

    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int sum = 0;
        for (int i = 1; i < A.size(); i++) {
            sum += Integer.max(Math.abs(A.get(i) - A.get(i - 1)), Math.abs(B.get(i) - B.get(i - 1)));
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
