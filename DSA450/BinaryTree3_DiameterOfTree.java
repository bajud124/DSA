// https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1
package DSA450;

public class BinaryTree3_DiameterOfTree {
    int ans= 0  ; 
    int diameter(Node root) {
        height (root);
        return ans;
    }
    
    int height (Node root) {
        if(root == null) return 0;
        
        int lh = height( root.left);
        int rh = height( root.right);
        
        ans =  Math.max ( ans , 1+lh+ rh);
        return 1+ Math.max(lh , rh);
    }
}
