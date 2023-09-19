package InterviewBit.Stack;

import java.util.ArrayList;
import java.util.Stack;

class StackPair {
    public int index;
    public int value;

    StackPair(int index, int value) {
        this.index = index;
        this.value = value;
    }
}

public class NearestSamllerElement {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<StackPair> stack = new Stack<StackPair>();
        for (int i = 0; i < A.size(); i++) {
            if (stack.isEmpty()) {
                result.add(-1);
            } else if (!stack.isEmpty() && stack.peek().value > A.get(i)) {
                result.add(i - stack.peek().value);
            } else if (!stack.isEmpty() && stack.peek().value <= A.get(i)) {
                while (!stack.isEmpty() && stack.peek().value <= A.get(i)) {
                    stack.pop();
                }
                result.add(i - stack.peek().index);
            }
            stack.push(new StackPair(i, A.get(i)));
        }
        return result;
    }
}
