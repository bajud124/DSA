package DSA450;

public class BST0_SearchNodeInBST {
    // itrative method
    boolean search(Node root, int x) {
        while (root != null) {
            if (root.data == x)
                return true;
            else if (root.data > x)
                root = root.left;
            else
                root = root.right;
        }
        return false;
    }

    // recursion method
    boolean search_recursion(Node root, int x) {
        if (root == null)
            return false;

        if (root.data == x)
            return true;
        else if (root.data < x)
            return search_recursion(root.right, x);
        else
            return search_recursion(root.left, x);
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
