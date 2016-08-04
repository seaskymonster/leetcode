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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        helper(result, root, 0);
        return result;
    }
    
    public void helper(List<Integer> result, TreeNode root, int depth){
        if(root == null) return;
        if(result.size() == depth){
            result.add(root.val);
        }
        helper(result, root.right, depth+1);
        helper(result, root.left, depth+1);
    }
}