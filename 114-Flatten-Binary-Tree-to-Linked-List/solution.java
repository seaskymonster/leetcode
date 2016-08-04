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
    public void flatten(TreeNode root) {
       helper(root);
    }
    
    public TreeNode helper(TreeNode root){
        if(root == null) return null;
        if(root.left == null && root.right == null) return root;
        if(root.left == null){
            return helper(root.right);
        }
        if(root.right == null){
            root.right = root.left;
            root.left = null;
            return helper(root.right);
        }
        
        TreeNode leftLastNode = helper(root.left);
        TreeNode rightLastNode = helper(root.right);
        
        leftLastNode.right = root.right;
        root.right= root.left;
        root.left = null;
        return rightLastNode;
    }
}