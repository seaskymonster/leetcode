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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(result, root);
        return result;
    }
    
    public void helper(List<Integer> result, TreeNode root){
        if(root == null) return;
        result.add(root.val);
        helper(result, root.left);
        helper(result, root.right);
    }
}