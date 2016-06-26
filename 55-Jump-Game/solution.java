public class Solution {
    public boolean canJump(int[] nums) {
        if(nums == null || nums.length == 0) {
            return false;
        }
        int[] f = new int[nums.length]; // f[i] represent the maximum position includes i and before, it can arrive;
        f[0] = nums[0];
        for( int i = 1; i < nums.length; i++){
            if(f[i-1] < i){
                return false;
            }
            f[i] = Math.max(f[i-1],i+nums[i]);
        }
        return f[nums.length-1] >= nums.length-1;
        
    }
}