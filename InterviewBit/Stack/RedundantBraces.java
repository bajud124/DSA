package InterviewBit.Stack;

import java.util.Stack;

public class RedundantBraces {
    public int braces(String A) {
        Stack<Character> stack = new Stack<Character>();
        if (A.contains("(") && !(A.contains("+")||A.contains("-")||A.contains("*")||A.contains("/"))){
            return 1;
        }
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != ')') {
                stack.push(A.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return 1;
                } else {
                    int chr = 0;
                    if (stack.peek() == '(') {
                        return 1;
                    } else {
                        while (stack.peek() != '(') {
                            if (stack.peek() == '+' || stack.peek() == '-' || stack.peek() == '*' || stack.peek() == '/') {
                                chr++;
                            }	
                            stack.pop();
                        }
                    }
                    if (chr==0){
                        return 1;
                    }
                    stack.pop();
                }
            }
        }
        return 0;
    }
}
