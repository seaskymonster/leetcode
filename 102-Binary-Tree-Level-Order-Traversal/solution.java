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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i =0; i <size; i++){
                TreeNode tmp = q.poll();
                level.add(tmp.val);
                if(tmp.left != null){
                    q.offer(tmp.left);
                }
                if(tmp.right != null){
                    q.offer(tmp.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}