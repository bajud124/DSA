package InterviewBit.Stack;

import java.util.ArrayList;
import java.util.Stack;

public class EvaluateExpression {
    public int evalRPN(ArrayList<String> A) {
        Stack<Integer> stack = new Stack<>();
	    
	    for(String opr : A) {
	        if(opr.equals("+") || opr.equals("-") || opr.equals("*") || opr.equals("/")) {
	            int num1 = stack.pop();
	            int num2 = stack.pop();
	            switch(opr) {
	                case "+" : int sum = num1 + num2;
	                           stack.push(sum);
	                           break;
	                case "-" : int diff = num2 - num1;
	                           stack.push(diff);
	                           break;
	                case "*" : int mult = num1 * num2;
	                           stack.push(mult);
	                           break;
	                case "/" : int div = num2 / num1;
	                           stack.push(div);
	            }
	        }
	        else {
	            stack.push(Integer.parseInt(opr));
	        }
	    }
	    
	    return stack.pop();
    }    
}
