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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        
        while(!stack.isEmpty || cur != null){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            
            TreeNode tmp = stack.pop();
            result.add(tmp.val);
            cur = cur.right;
        }
        return result;
    }
}