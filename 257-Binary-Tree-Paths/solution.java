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
    public List<String> binaryTreePaths(TreeNode root) {
      List<String> result = new ArrayList<String>();
      if(root == null){
          return result;
      }
      String s = new String();
      branch(result, root, s + root.val);
      return result;
    }
    
    public void branch(List<String> result, TreeNode root, String s){
      
        
        if(root.left == null && root.right == null){
            result.add(new String(s));
            return;
        }
        if(root.left != null){
           branch(result, root.left, s+ "->" + root.left.val); //iterative, 即使要跟17行一样。。。把要遍历点的值加进去。
        }
        if(root.right != null){
           branch(result, root.right, s+ "->" + root.right.val);
        }
    }
}