public class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        // if(nums.lenght == 2) return Math.max(nums[0], nums[1]); unnecessary
        return Math.max(helper(nums, 0, nums.length-2), helper(nums, 1, nums.length-1));
        // 分成两类讨论：
         //  第一个抢：第二个不抢，最后一个不抢，考虑中间那段
         //  第一个不抢：考虑中间那段就好了
    }
    
    public int helper(int[] nums, int start, int end){
  
        if(start == end){
            return nums[start];
        }
        if(start + 1 == end){
            return Math.max(nums[start], nums[end]); // the corner case should be considered above...
        }
        
        int[] f = new int[end - start + 1];
        f[0] = nums[start];
        f[1] = Math.max(nums[start], nums[start+1]);
        for(int i = 2; i <= end-start; i++){
            f[i] = Math.max(f[i-2] + nums[i+start], f[i-1]);
        }
        
        return f[end-start];
    }
}