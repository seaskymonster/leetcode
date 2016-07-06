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
    private TreeNode tmp;
    public int closestValue(TreeNode root, double target) {
        TreeNode ret = root;
        while(root != null){
            if(Math.abs(root.val - target) <= Math.abs(ret.val - target)){
                ret = root;
            }
            if(root.val > target){
                root = root.left;
            }else{
                root = root.right;
            }
        }
        return ret.val;
    }
}