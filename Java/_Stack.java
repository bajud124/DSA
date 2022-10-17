// Stack is predefine class which import from java.utill
// stack has last-in-first-out(LIFO) structure 
package Java;

import java.util.Stack;

public class _Stack {
    public static void main(String[] args) {
        // decalre stack 
        Stack<String> animals = new Stack<String>();

        // add element in stack 
        animals.push("dog");
        animals.push("cat");
        animals.push("lion");

        // it will pick last element from stack 
        // O/P: lion
        System.out.println(animals.peek());

        // It will remove last element from stack and return removed element
        // O/P: lion
        System.out.println(animals.pop());

        // it will return true if stack is empty
        // O/P: false
        System.out.println(animals.empty());
    }
}
