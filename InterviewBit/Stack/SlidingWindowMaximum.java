package InterviewBit.Stack;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindowMaximum {
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        Deque<Integer> dq = new LinkedList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < B; i++) {
            while (!dq.isEmpty() && A.get(dq.peekLast()) <= A.get(i)) {
                dq.pollLast();
            }
            dq.addLast(i);
        }
        result.add(A.get(dq.getFirst()));
        for (int i = B; i < A.size(); i++) {
            while (!dq.isEmpty() && A.get(dq.peekLast()) <= A.get(i)) {
                dq.pollLast();
            }
            dq.addLast(i);
            if (dq.peekFirst() == i - B) {
                dq.pollFirst();
            }
            result.add(A.get(dq.getFirst()));
        }
        return result;
    }
}
