// https://practice.geeksforgeeks.org/problems/reverse-level-order-traversal/1
package DSA450;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree1_ReverseLevelOrder {
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()) {
            Node curr = q.remove();
            result.add(0, curr.data);
            if (curr.right != null) {
                q.add(curr.right);
            }
            if (curr.left != null) {
                q.add(curr.left);
            }
        }
        return result;
    }
}
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}