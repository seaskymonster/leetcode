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
       if(root == null) return 0;
       int left = getLeft(root);
       int right = getRight(root);
       if(left == right){
           return (1 << left) -1;
       }else{
          return 1 + countNodes(root.left) + countNodes(root.right);
       }
    }
    
    public int getLeft(TreeNode root){
        int depth = 0;
        while(root != null){
            depth ++;
            root = root.left;
        }
        return depth;
    }
    
      
    public int getRight(TreeNode root){
        int depth = 0;
        while(root != null){
            depth ++;
            root = root.right;
        }
        return depth;
    }
    
    
    

}