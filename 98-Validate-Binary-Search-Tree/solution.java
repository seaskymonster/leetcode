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
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        
        boolean left = isValidBST(root.left);
        boolean right = isValidBST(root.right);
        
        return left && right && (root.left == null ||(root.left !=null && root.left.val < root.val)) && (root.right == null ||(root.right !=null && root.right.val > root.val))
    }
}