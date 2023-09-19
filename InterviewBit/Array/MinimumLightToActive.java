package InterviewBit.Array;
import java.util.ArrayList;

public class MinimumLightToActive {
    public int Solution(ArrayList<Integer> A, int B) {
        int cur = 0;
        int count = 0;
        if (A.size() < B) {
            if (A.contains(1)) {
                return 1;
            } else {
                return -1;
            }
        } else {
            while (cur < A.size()) {
                int next = cur + B - 1;
                int previous = cur - B + 1;
                if (previous < 0) {
                    previous = 0;
                }
                if (next >= A.size()) {
                    next = A.size() - 1;
                }
                int index = next;
                while (index > previous) {
                    if (A.get(index) == 1) {
                        break;
                    }
                    index--;
                }
                if (index > previous) {
                    count++;
                    cur = index + B;
                } else {
                    return -1;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        MinimumLightToActive m = new MinimumLightToActive();
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        A1.add(0);
        A1.add(0);
        A1.add(1);
        A1.add(1);
        A1.add(0);
        A1.add(0);
        A1.add(0);
        A1.add(0);
        System.out.println(m.Solution(A1, 3));
    }
}
