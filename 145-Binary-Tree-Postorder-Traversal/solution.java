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
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>(); 
        TreeNode cur = root;
        while(!stack.isEmpty() || cur!=null){
            while(cur != null){
                result.addFirst(cur.val);
                cur = cur.right;
            }
            TreeNode tmp = stack.pop();
            cur = tmp.left;
        }
        return result;
    }
}