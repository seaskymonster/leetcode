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
    public int rob(TreeNode root) {
        if(root == null) return 0;
        int[] result = helper(root);
        return Math.max(result[0], result[1]);
        
    }
    
    public int[] helper(TreeNode root){
        int[] result = new int[2];
        if(root == null){
            return result;
        }
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        
        result[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        result[1] = left[0]+ right[0] + root.val;
        return result;
    }
}