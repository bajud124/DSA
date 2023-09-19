
package GFG;

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    Node (int data) {
        this.data= data;
        left = null;
        right= null;
    }
}
public class LowestCommonAncestorBST {
    Node LCA(Node root, int n1, int n2)
	{
	    // create set for n1 ansector value 
        Set<Node> set = new HashSet<>();
        Node temp = root;
        while (temp.data != n1) {
            set.add(temp);
            if (temp.data < n1) {
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }
        set.add(temp);
        // stack for ansector of n2 value
        Stack<Node> stack = new Stack<>();
        Node temp2 = root;
        // travse in tree for n2 ansector while for that value present in ansector set of n1
        while (temp2.data != n2 && set.contains(temp2)) {
            stack.push(temp2);
            if (temp2.data < n2) {
                temp2 = temp2.right;
            } else {
                temp2 = temp2.left;
            }
        }
        // check for next ansector of n2 value 
        if (set.contains(temp2) && temp2.data == n2) {
            stack.push(temp2);
        }
        return stack.peek();
    }
}
