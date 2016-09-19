public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length]; // dp[i] represent lengthofLIS at the end of nums[i] 
   // must use nums[i] as the end of LIS;
        Arrays.fill(dp, 1); // for every element, the minum length is 1
        for(int i = 1; i < dp.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                   dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        int result = 0;
        for(int i = 0; i< dp.length; i++){
            result = Math.max(dp[i], result);
        }
        return result;
    }
}