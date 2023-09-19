package InterviewBit.Stack;

import java.util.Stack;

// Min stack with O(1) time complexity and O(1) space complexity

public class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    int minEle = Integer.MIN_VALUE;
    public void push(int x) {
        if (stack.isEmpty()){
            minEle = x;
            stack.push(x);
        } else if (minEle >x){
            stack.push(2*x- minEle);    // 2*x-minEle logic use to push the element in stack in pop we use revert to get original element 
            minEle = x;
        } else {
            stack.push(x);
        }
    }

    public void pop() {
        if (!stack.isEmpty()){
        int t = stack.pop();
        if (t<minEle){
            minEle = 2*minEle - t;  //Reverce logic of push to get original element
        }
    }
    }

    public int top() {
        if (stack.isEmpty()){
            return -1;
        } else {
            int t = stack.peek();
            // We use logic for store minEle so we get top element we use this logic 
            // so if top element is lesser than minimun element then it will return minelement  
            if (t<minEle){          
                return minEle;
            } else {
                return t;
            }
        }
    }

    public int getMin() {
        if (stack.isEmpty()){
            return -1;
        } else{
            return minEle;
        }
    }
}


class MinStackWithSpace {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x<=minStack.peek()){
            minStack.push(x);
        }
    }
    public void pop() {
        if (stack.isEmpty()){
            return;
        }
        if (!minStack.isEmpty() && minStack.peek() == stack.peek()){
            minStack.pop();
        }
        if (!stack.isEmpty()){
            stack.pop();
        }
    }
    public int top() {
        if (stack.isEmpty()){
            return -1;
        } else {
        return stack.peek();
        }
    }
    public int getMin() {
        if (stack.isEmpty()){
            return -1;
        } else {
            return minStack.peek();
        }
    }
}