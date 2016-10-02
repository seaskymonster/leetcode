public class Solution {
     public int minSubArrayLen(int s, int[] nums) {
        if(nums == null || nums.length == 0) return 0;
    
        int j = 0;
        int result = Integer.MAX_VALUE;
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++){
            while(sum < s && j < nums.length){
                sum += nums[j];
                j++;
            }
            // System.out.println("i "+i);
            // System.out.println("j "+j);
            if(sum >= s){
                result = Math.min(result, j-i);
            }
            sum -= nums[i];
        }
        if(result == Integer.MAX_VALUE)
            result = 0;
        return result;
    }
}