public class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length -1;
        int result = 0;
        
        while(start < end){
            result = Math.max(result, (end - start)*Math.min(height[start], height[end]));
            if(height[start] <= height[end]){
                start++;
            }else{
                end--;
            }
        }
        return result;
    }
}