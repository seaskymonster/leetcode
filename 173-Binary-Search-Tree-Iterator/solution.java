public class BSTIterator {
    Stack<TreeNode> stack = new Stack<TreeNode>();
    TreeNode cur;

    public BSTIterator(TreeNode root) {
       cur = root;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
       return (!stack.isEmpty() || cur != null);
    } 

    /** @return the next smallest number */
    public int next() {
        while(cur != null){ // if cur is null, go to stack to pop the upper level node
            stack.push(cur);
            cur = cur.left;
        }
        TreeNode node = stack.pop();
        cur = node.right;
        return node.val;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */