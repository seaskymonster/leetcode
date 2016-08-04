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
    public void flatten(TreeNode root) {
        TreeNode cur = root;
        if(root == null) return;
        while(cur != null){
            if(cur.left != null){
                flatten(cur.left);
                cur.right = cur.left;
                cur = cur.right;
            }
        }
    }
}