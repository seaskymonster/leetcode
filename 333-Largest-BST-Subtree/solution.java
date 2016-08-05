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
    private int result = 0;
    public int largestBSTSubtree(TreeNode root) {
       helper(root);
       return result;
    }
    
    public int helper(TreeNode root){
        if(root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        if(left == -1 || right == -1) return -1;
        
        TreeNode leftlarge = root.left;
        while(leftlarge != null && leftlarge.right != null){
            leftlarge = leftlarge.right;
        }
        
        TreeNode rightsmall = root.right;
        while(rightsmall != null && rightsmall.left != null){
            rightsmall = rightsmall.left;
        }
        
        if(left == 0 && right == 0) {
            result = Math.max(result, 1);
            return 1;
        }

        if(left == 0){
            if(root.val < rightsmall.val){
               result = Math.max(result, right+1);
               return right+1;
            }else{
                return -1;
            }
        }
        if(right == 0){
            if(root.val > leftlarge.val){
                result = Math.max(result, left+1);
                return left+1;
            }else{
                return -1;
            }
        }
        
        if(root.val > leftlarge.val && root.val <  rightsmall.val){
               result = Math.max(result, left+right+1);
               return left+right+1;
           }else{
               return -1;
         }
        
    
    }
}