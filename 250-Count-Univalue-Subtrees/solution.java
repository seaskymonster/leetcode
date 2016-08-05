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
    private int number = 0;
    public int countUnivalSubtrees(TreeNode root) {
        helper(root);
        return number;
    }
    
    public boolean  helper(TreeNode root){
        if(root == null) return true;
        boolean left = helper(root.left);
        boolean right = helper(root.right);
        if(!left || !right) {
            return false;
        }else{
            if((root.left == null || (root.left != null && root.left.val == root.val)) && (root.right == null || (root.right != null && root.right.val == root.val))) {
                number ++;
                return true;
            }else{
                return false;
            }
        }
        
    }
    
}