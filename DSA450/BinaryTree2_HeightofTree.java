// https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1
package DSA450;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree2_HeightofTree {
    // with recursion
    int height_recursive(Node node) {
        if (node == null)
            return 0;
            // return max of left subtree and right subtree with adding 1
        return 1 + Math.max(height_recursive(node.left), height_recursive(node.right));
    }

    // with iteration
    int height_itrative(Node node) {
        int ht = 0;
        Queue<Node> q = new LinkedList<>();
        // add root node with null to queue so when null came we can increse hieght with one
        q.add(node);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                ht++;
                // after remove null if queue is empty then it's last node of the tree
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
        }
        return ht;
    }
}

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
