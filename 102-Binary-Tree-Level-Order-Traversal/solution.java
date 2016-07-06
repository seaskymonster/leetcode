/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// public class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {
//       List<List<Integer>> result = new ArrayList<>();
//       if(root == null){
//           return result;
//       }
//       Queue<TreeNode> q = new LinkedList<TreeNode>();
//       q.offer(root);
//       while(!q.isEmpty()){
//           List<Integer> current = new ArrayList<Integer>();
//           for(int i = 0; i < q.size(); i++){
//               TreeNode cur = q.poll();
//               current.add(cur.val);
//               if(cur.left != null){
//                   q.offer(cur.left);
//               }
//               if(cur.right != null){
//                   q.offer(cur.right);
//               }
//           }
//           result.add(current);
//       }
//       return result;
//     }
// }


public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if(root == null) {
            return result;
        }
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<Integer>();
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                level.add(node.val);
                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}