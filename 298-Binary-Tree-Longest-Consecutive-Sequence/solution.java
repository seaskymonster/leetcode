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
    private int result = 0;
    public int longestConsecutive(TreeNode root) {
        if(root == null) return result;
        helper(root, 0, root.val);
        return result;
    }
    
    public void helper(TreeNode root, int curlength, int target){
        if(root == null) return;
        curlength = root.val == target ? curlength+1 : 1;
        result = Math.max(result, curlength);
        helper(root.left, curlength, root.val+1);
        helper(root.right, curlength, root.val+1);
    }
}