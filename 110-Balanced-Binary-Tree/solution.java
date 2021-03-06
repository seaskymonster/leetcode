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
        return getHeight(root) != -1;
    }
    public int getHeight(TreeNode root){
        if(root == null) return 0;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if(left == -1 || right == -1 || Math.abs(left - right) >1){
            return -1;
        }else{
            return Math.max(left, right) +1;
        }
    }
}