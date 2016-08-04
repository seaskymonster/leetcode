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
        int position = findIndex(inorder, postorder[pright], ileft, iright);
        TreeNode root = new TreeNode(inorder[ileft]);
        TreeNode left = helper(inorder, postorder, ileft, position-1, pleft, position-ileft + pleft -1 ;
        TreeNode right = helper(inorder, postorder, position + 1, iright, pright - (iright - position), pright-1);
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