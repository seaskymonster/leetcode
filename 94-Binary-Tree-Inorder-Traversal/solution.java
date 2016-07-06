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
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root == null) return result;
        TreeNode cur = root;

        while(!stack.empty() || cur != null){ // 这里一定加 || cur != null, 说明当前节点还没遍历完。即使现在stack是空的，我还有当前节点的自己点可以往stack 里面放。
            while(cur != null){
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            stack.pop();
            result.add(cur.val);
            // if(cur.right != null){ // 没想明白为啥不能加这句。
                cur = cur.right;
            
        }
        return result;
    }
    
    // public ArrayList<Integer> inorderTraversal(TreeNode root) {
    //     Stack<TreeNode> stack = new Stack<TreeNode>();
    //     ArrayList<Integer> result = new ArrayList<Integer>();
    //     TreeNode curt = root;
    //     while (curt != null || !stack.empty()) {
    //         while (curt != null) {
    //             stack.add(curt);
    //             curt = curt.left;
    //         }
    //         curt = stack.peek();
    //         stack.pop();
    //         result.add(curt.val);
    //         curt = curt.right;
    //     }
    //     return result;
    // }
}