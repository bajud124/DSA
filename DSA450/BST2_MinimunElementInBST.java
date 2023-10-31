// https://practice.geeksforgeeks.org/problems/minimum-element-in-bst/1
package DSA450;

public class BST2_MinimunElementInBST {
    public int minValue(Node node) {
        if (node == null)
            return -1;
        while(node.left!= null) {
            node = node.left;
        }
        return node.data;
    }
}

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}