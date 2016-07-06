/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        if(root.left != null && root.right != null){
            return (root.left.val == root.right.val && isSymmetirc(root.left) && isSymmetric(root.right));
        }
        
        return false;
    }
}