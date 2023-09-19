package InterviewBit.Array;
import java.util.List;

public class MaxSumContiguousSubArray {
    public int maxSubArray(final List<Integer> A) {
        int cur_sum =0;
        int max_sum = Integer.MIN_VALUE;
        for (int i =0;i< A.size();i++) {
            cur_sum += A.get(i);
            max_sum = Math.max(cur_sum, max_sum);
            if (cur_sum < 0)
                cur_sum = 0;
        }
        return max_sum;
    }
}
