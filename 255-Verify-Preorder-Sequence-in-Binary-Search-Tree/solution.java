public class Solution {
    public boolean verifyPreorder(int[] preorder) {
        if(preorder.length <= 2) return true;
        return helper(0, preorder.length-1, preorder);
    }
    
    public boolean helper(int start, int end, int[] preorder){
        if(end - start + 1 <= 2 ) return true;
        int position = Integer.MAX_VALUE;
        for(int i = start + 1; i <= end; i++){
            if(preorder[i] > preorder[start]){
                position = i;
                break;
            }
        }
        if(position == Integer.MAX_VALUE){
            position = end +1;
        }
        
        for(int j = position; j <= end; j++){
            if(preorder[j] < preorder[start]){
                return false;
            }
        }
        return helper(start + 1, position -1, preorder) && helper(position, end, preorder);
    }
}