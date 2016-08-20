public class Solution {
    public int trap(int[] height) {
        if(height == null || height.length < 3) return 0;
        int left = 0;
        int right = height.length -1;
        int result = 0;
        int leftheight = height[left];
        int rightheight = height[right];
        while(left < right){ // TODO
          if(leftheight <= rightheight){
              left++;
              if(height[left] <= leftheight){
                  result += leftheight - height[left];
              }else{
                  leftheight = height[left];
              }
          }else{
              right--;
              if(height[right] <= rightheight){
                  result += rightheight - height[right];
              }else{
                  rightheight = height[right];
              }
          }
        }
        return result;
    }
}