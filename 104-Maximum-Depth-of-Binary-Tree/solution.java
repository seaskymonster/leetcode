/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution { // 可以用往下traversal 或者divide and conquer 两种方法做。
    private int max = 0;
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        helper(root, 0);
        return max;
    }
    public void helper(TreeNode root, int depth){
        if(root == null) return;
        depth ++;
        max = Math.max(max, depth);
        helper(root.left, depth);
        helper(root.right, depth);
    }
}