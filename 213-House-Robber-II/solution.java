public class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        // if(nums.lenght == 2) return Math.max(nums[0], nums[1]); unnecessary
        return Math.max(helper(nums, 0, nums.length-2), helper(nums, 1, nums.length-1));
    }
    
    public int helper(int[] nums, int start, int end){
  
        if(start == end){
            return nums[start];
        }
        if(start + 1 == end){
            return Math.max(nums[start], nums[end]);
        }
        
        int[] f = new int[end - start + 1];
        f[start] = nums[start];
        f[start+1] = Math.max(nums[start], nums[start+1]);
        for(int i = start+2; i <= end; i++){
            f[i] = Math.max(f[i-2] + nums[i], f[i]);
        }
        
        return f[end];
    }
}