/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// public class Solution { // traversl 的方法。
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> result = new ArrayList<>();
//         helper(result, root);
//         return result;
//     }
    
//     public void helper(List<Integer> result, TreeNode root){
//         if(root == null) return;
//         result.add(root.val);
//         helper(result, root.left);
//         helper(result, root.right);
//     }
// }

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            result.add(node.val);
            if(root.right != null){
               stack.push(root.right);
            }
            if(root.left != null){
               stack.push(root.left);
            }
        }
        return result;
    }
}