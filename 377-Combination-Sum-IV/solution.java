public class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1]; // dp[i] = dp[i-1] + dp[i-2] +....+dp[0];
        dp[0] = 1; // we set dp[0] = 1, why
        
        for(int i = 1; i <= target; i++){
            for(int j = 0; j < nums.length; j++){
         
                if(i - nums[j] >= 0){
    
                    dp[i] += dp[i - nums[j]];
                }
            }
        }
        return dp[target];
        
    }
}