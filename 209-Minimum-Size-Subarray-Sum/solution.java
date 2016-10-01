public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int i = 0;
        int j = 0;
        int result = Integer.MAX_VALUE;
        int sum = nums[0];
        
        while(i<j && j < nums.length){
            if(sum >= s){
                result = Math.min(result, j-i+1);
                sum = sum - nums[i];
                i++;
            }else{
                sum = sum + nums[j];
                j++;
            }
        }
        return result;
    }
}