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
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        int height = helper(result, root);
        return result;
    }
    
    public int helper(List<List<Integer>> result, TreeNode root){
        if(root == null) return -1;
        int height = Math.max(helper(result, root.left), helper(result, root.right))+1;
        if(result.size() -1 < height) result.add(new ArrayList<Integer>()); // height from 0 1 2...
        result.get(height).add(root.val);
        return height;
    }
    
  
}