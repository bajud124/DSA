package InterviewBit.Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

// class StackPair{
//     public int index;
//     public int value;

//     StackPair(int index, int value){
//         this.index = index;
//         this.value = value;
//     }
// }
public class LargestRectangleHistogram {
    public int largestRectangleArea(ArrayList<Integer> A) {
        int maxArea = 0;
        ArrayList<Integer> right = NearestSamllerToRight(A);
        ArrayList<Integer> left = NearestSmallerToLeft(A);
        for (int i = 0; i < A.size(); i++) {
            // Generate area for element using left and right nearest samllest element 
            int area = (right.get(i) - left.get(i)-1)*A.get(i);
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }

    // To get nearest smallest element from left array 
    public ArrayList<Integer> NearestSmallerToLeft(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<StackPair> stack = new Stack<StackPair>();
        for (int i = 0; i < A.size(); i++) {
            if (stack.isEmpty()) {
                result.add(0);
            } else if (!stack.isEmpty() && stack.peek().value < A.get(i)) {
                result.add(stack.peek().index+1);
            } 
            else if (stack.size() > 0 && stack.peek().value >= A.get(i)) {
                while (!stack.isEmpty() && A.get(i) <= stack.peek().value) {
                    stack.pop();
                }
                if (stack.isEmpty()){
                    result.add(0);
                } else {
                    result.add(stack.peek().index+1);
                }
            }
            stack.push(new StackPair(i, A.get(i)));
        }
        return result;
    }

// To get nearest smallest element from right array 
    public ArrayList<Integer> NearestSamllerToRight(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<StackPair> stack = new Stack<StackPair>();
        for (int i = A.size()-1; i >= 0; i--) {
            if (stack.isEmpty()) {
                result.add(A.size()+1);
            } else if (stack.size() > 0 && stack.peek().value < A.get(i)) {
                result.add(stack.peek().index+1);
            } else if (stack.size() > 0 && stack.peek().value >= A.get(i)) {
                while (!stack.isEmpty() && A.get(i) <= stack.peek().value) {
                    stack.pop();
                }
                if (stack.isEmpty()){
                    result.add(A.size()+1);
                } else {
                    result.add(stack.peek().index+1);
                }
            }
            stack.push(new StackPair(i, A.get(i)));
        }
        Collections.reverse(result);
        return result;
    }    

}
