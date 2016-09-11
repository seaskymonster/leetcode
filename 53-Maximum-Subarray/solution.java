public class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length]; // dp[i] represents the maximum subarray regard nums[i] as the end
        dp[0] = nums[0];
        for(int i = 1; i < dp.length; i++){
            dp[i] = dp[i-1] > 0 ? dp[i-1] +nums[i] : nums[i];
        }
        int result = Integer.MIN_VALUE;
        for(int i = 0; i < dp.length; i++){
            result = Math.max(result, dp[i]);
        }
        return result;
    }
}