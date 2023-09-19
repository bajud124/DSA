package DSStack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NearestGraterToRight {
    public ArrayList<Integer> solution(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = A.size()-1; i >= 0; i--) {
            if (stack.isEmpty()) {
                result.add(-1);
            } else if (stack.size() > 0 && stack.peek() > A.get(i)) {
                result.add(stack.peek());
            } else if (stack.size() > 0 && stack.peek() < A.get(i)) {
                while (!stack.isEmpty() && A.get(i) >= stack.peek()) {
                    stack.pop();
                }
                if (stack.isEmpty()){
                    result.add(-1);
                } else {
                    result.add(stack.peek());
                }
            }
            stack.push(A.get(i));
        }
        Collections.reverse(result);
        return result;
    }
}
