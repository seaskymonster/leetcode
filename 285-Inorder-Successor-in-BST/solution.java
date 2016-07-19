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
    // public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
    //     Stack<TreeNode> stack = new Stack<>();
    //     TreeNode cur = root;
    //     while(!stack.isEmpty() || cur != null){
    //         while(cur != null){
    //             stack.push(cur);
    //             cur = cur.left;
    //         }
    //         TreeNode node = stack.pop();
    //         if(node == p){
    //             cur = node.right;
    //             if(cur != null){
    //                 return cur;
    //             }else if(!stack.isEmpty()){
    //                 return stack.pop();
    //             }
    //             break;
    //         }
    //         cur = node.right;
            
    //     }
    //   return null;
    // }
    
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
       TreeNode cur = root;
       TreeNode successor = null;
       while(cur != null || cur.val != p.val){
           if(cur.val > p.val){
               successor = cur;
               cur = cur.left;
           }else{
               cur = cur.right;
           }
       }
       
       if(cur == null){
           return null;
       }
       
       if(cur.right == null){
           return successor;
       }
       
       cur = cur.right;
       while(cur.left != null){
           cur = cur.left;
       }
       
       return cur;
    }
}