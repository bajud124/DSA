package InterviewBit.Stack;

import java.util.Stack;

public class SimplifyDirectoryPath {
    public String simplifyPath(String A) {
        Stack<String> stack = new Stack<String>();
        String[] paths = A.split("/");
        for (int i = 0; i < paths.length; i++) {
            if (paths[i].equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (paths[i].equals(".") || paths[i].equals("")) {
                continue;
            } else {
                stack.push(paths[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (stack.isEmpty()) {
            sb.append("/");
        } else {
            while (!stack.isEmpty()) {
                sb.insert(0, "/" + stack.pop());
            }
        }
        return sb.toString();
    }
}