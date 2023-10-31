// https://leetcode.com/problems/delete-node-in-a-bst/description/
package DSA450;

public class BST1_DeleteNodeinBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        // if the roor is null then retuen root
        if (root == null) {
            return root;
        }
        // if the key is greater than the value then delete key from right subtree
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        // if the key is lesser than the value then delete key from left subtree
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else {
            // case 1
            // return null if root is leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2
            // if left is null then return right subtree which delete current node
            if (root.left == null) {
                return root.right;
            }
            // if right is null then return left subtree which delete current node
            if (root.right == null) {
                return root.left;
            }

            // case 3
            // find leftmost node and put it at key node. 
            else {
                TreeNode leftmost = root.right;
                while (leftmost.left != null) {
                    leftmost = leftmost.left;
                }
                root.val = leftmost.val;
                root.right = deleteNode(root.right, root.val);
            }
        }
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
