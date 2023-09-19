package LeetCode;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()){
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()){
             return false;
        } else {
            return true;
        }
    }
}
