public class Solution {
    // public int maxSubArray(int[] nums) {
    //     if(nums.length == 0) {
    //         return 0;
    //     }
    //     int[] f = new int[nums.length];
    //     f[0] = nums[0];
    //     for(int i = 1; i < nums.length; i++){
    //         //f[i] = Math.max(f[i-1] + nums[i], nums[i]); 
    //         f[i] = f[i-1] >=0 ? f[i-1]+nums[i] : nums[i];// the maxsum before is a negtive, drop it, if it is positive ,use it
    //     }
    //     int result = Integer.MIN_VALUE;
    //     for(int j = 0; j < nums.length; j++){
    //         result = f[j] > result ? f[j] : result;
    //     }
    //     return result;
    // }
    
      public int maxSubArray(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int[] sum = new int[nums.length+1];
        sum[0] = 0;
        for(int i = 1; i < sum.length; i++){
            sum[i] = sum[i-1] + nums[i-1];
        }
        
        int min = Integer.MAX_VALUE;
        int maxsub = 0;
        for (int j = 0; j < sum.length; j++){
            maxsub = Math.max(maxsub, sum[i]-min);
            min = Math.min(min, sub[i]);
        }
        return maxsub;
    }
}