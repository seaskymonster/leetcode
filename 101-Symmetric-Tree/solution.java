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
        else return isMirror(root, root);
    }
    
    public boolean isMirror(TreeNode left, TreeNode right){
        if(left != null && right == null){
            return false;
        }
        if(left == null && right != null){
            return false;
        }
        if(left == null && right == null){
            return true;
        }else{
            return left.val == right.val && isMirror(left.right, right.left) && isMirror(left.left, right.right);
        }
    }
}