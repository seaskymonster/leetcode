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
    public int countNodes(TreeNode root) {
        List<TreeNode> lastlevel = new ArrayList<TreeNode>();
        int height = helper(root, lastlevel)
        return 2^height -1 + lastlevel.size();
    }
    
    public int helper(TreeNode root, List<TreeNode> lastlevel){
        if(root == null) return -1;
        if(root.left == null && root.right == null){
            lastlevel.add(root);
            return 1;
        }
        int left = helper(root.left, lastlevel);
        int right = helper(root.right, lastlevel);
        return Math.max(left, right) + 1;
    }
}