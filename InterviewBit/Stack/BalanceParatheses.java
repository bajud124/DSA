package InterviewBit.Stack;

import java.util.Stack;

public class BalanceParatheses {
    public int solve(String A) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0;i<A.length();i++){
            if (A.charAt(i) == '('){
                stack.push(A.charAt(i));
            } else {
                if (stack.isEmpty()){
                    return 0;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()){
            return 1;
        } else {
            return 0;
        }
    }    
}
