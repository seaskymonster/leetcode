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
    // public boolean isValidBST(TreeNode root) { // the method below is wrong.....not only test every node, left half shold
    // less than the root, right half should greater than root.
    //     if(root == null){
    //         return true;
    //     }
        
    //     boolean left = isValidBST(root.left);
    //     boolean right = isValidBST(root.right);
        
    //     return left && right && (root.left == null ||(root.left !=null && root.left.val < root.val)) && (root.right == null ||(root.right !=null && root.right.val > root.val)); 
    // }
    
    
       public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        return helper(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
       }
       
       public boolean (TreeNode root, int max, int min){
           if(root == null){
               return true;
           }
           return root.val < max && root.val > min && helper(root.left, root.val, min) && helper(root.right, max, root.val);
       }
}