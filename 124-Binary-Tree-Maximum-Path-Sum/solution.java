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
    
    public int maxPathSum(TreeNode root){
        if(root == null) return 0;
        ReturnType result = helper(root);
        return result.maxPath;
    }
    
    public ReturnType helper(TreeNode root) {
        if(root == null) return new ReturnType(Integer.MIN_VALUE, Integer.MIN_VALUE);
        ReturnType left = helper(root.left);
        ReturnType right = helper(root.right);
        
        int maxPath = Math.max(left.maxPath, right.maxPath);
        maxPath = Math.max(maxPath, Math.max(0, left.singlePath) + Math.max(0, right.singlePath) + root.val);
        
        int singlePath = root.val+ Math.max(0, Math.max(left.singlePath,  right.singlePath));
      
        return new ReturnType(maxPath, singlePath);
        
    }
    
    
    class ReturnType {
        int maxPath;
        int singlePath;
        
        ReturnType(int maxPath, int singlePath){
            this.maxPath = maxPath;
            this.singlePath = singlePath;
        }
    }
}