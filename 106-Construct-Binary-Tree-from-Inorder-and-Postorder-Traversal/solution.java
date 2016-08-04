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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         if (inorder == null || postorder == null || inorder.length != postorder.length) {
            return null;
        }
        return helper(inorder, postorder, 0, inorder.length-1, 0, postorder.length -1);
    }
    
    public TreeNode helper(int[] inorder, int[] postorder, int ileft, int iright, int pleft, int pright){
        if(ileft > iright || pleft >pright) return null;
        int ibreak = findIndex(inorder, postorder[pright-1], ileft, iright);
        int pbreak = findIndex(postorder, inorder[ileft+1], pleft, pright);
        TreeNode root = new TreeNode(inorder[ileft]);
        TreeNode left = helper(inorder, postorder, ileft + 1, ibreak-1, pleft, pbreak);
        TreeNode right = helper(inorder, postorder, ibreak, iright, pbreak+1, pright-1);
        root.left = left;
        root.right = right;
        return root;
    }
    
    public int findIndex(int[] array, int key, int start, int end){
        for(int i = start; i <= end; i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
}