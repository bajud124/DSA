package Java;

import java.util.LinkedList;
import java.util.Queue;

import Common.TreeNode;

public class _Tree {
    public static void main(String[] args) {
        int[] array = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        TreeNode root = createTree(array);
        // preOrder(root);
        // System.out.println();
        inOrder(root);
        mirrorTree(root);
        System.out.println();
        inOrder(root);
        // levelOrder(root);
        // System.out.println(height(root));
    }

    // To get hright of binary tree
    static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right) + 1;
    }

    // get root in preoder -> root, left, right
    static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // get root list in order -> left, root, right
    static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // get root list in post order -> left, right, root
    static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    // get root list using order level
    static void levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            TreeNode curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    System.out.println();
                    q.add(null);
                }
            } else {
                System.out.print(curr.data + " ");
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
        }
    }

    static TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = mirrorTree(root.left);
        TreeNode right = mirrorTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    static int idx = -1;

    public static TreeNode createTree(int[] array) {
        idx++;
        if (array[idx] == -1) {
            return null;
        }
        TreeNode root = new TreeNode(array[idx]);
        root.left = createTree(array);
        root.right = createTree(array);
        return root;
    }
}
