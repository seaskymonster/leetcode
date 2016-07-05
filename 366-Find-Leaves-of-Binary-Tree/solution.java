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
        if(root == null){
            return result;
        }else{
            int height = dfs(result, root);
        }
        
        return result;
    }
    
    public int dfs(List<List<Integer>> result, TreeNode root){
       if(root == null){
           return 0;
       }
       
       int left = dfs(result, root.left);
       int right = dfs(result, root.right);
       int depth = Math.max(left, right) + 1;
       if(result.size() < depth){
           result.add(new ArrayList<>(root.val));
       }else{
           result.get(depth).add(root.val);
       }
       return depth;
    }
}