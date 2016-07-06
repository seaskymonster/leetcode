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
    public boolean isBalanced(TreeNode root) {
      if(root == null) return true;
      return max_depth(root) != -1;
    }
    
    public int max_depth(TreeNode root){
        if(root == null) return 0;
        int left = max_depth(root.left);
        int right = max_depth(root.right);
        if(left != -1 && right != -1 && Math.abs(left-right) <=1) {
            return Math.max(left, right) + 1;
        }
        else{
            return -1
        }
    }
}
 