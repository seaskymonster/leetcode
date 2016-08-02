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
      branch(result, root, s);
    }
    
    public void branch(List<String> result, TreeNode root, String s){
        if(root.left == null && root.right == null){
            s = s + "->" +root.val
            result.add(new String(s));
            return;
        }
        if(root.left != null){
           branch(result, root.left, s+ "->" + root.val)
        }
        if(root.rigth != null){
           branch(result, root.right, s+ "->" + root.val)
        }
    }
}