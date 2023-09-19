package InterviewBit.Array;
import java.util.ArrayList;

public class MaximumSumTriplate {
    public int solve(ArrayList<Integer> A) {
        int maxSum = 0;
        for (int i = A.size() - 1; i >= 2; i--) {
            int first = A.get(i);
            if (3 * (first - 1) <= maxSum)
                continue;
            for (int j = i - 1; j >= 0; j--) {
                int second = A.get(j);
                if (second >= first || second + second - 1 + first <= maxSum)
                    continue;
                for (int k = j - 1; k >= 0; k--) {
                    int third = A.get(k);
                    if (third >= second)
                        continue;
                    int sum = first + second + third;
                    if (maxSum < sum)
                        maxSum = sum;
                }
            }

        }
        return maxSum;
    }
}
