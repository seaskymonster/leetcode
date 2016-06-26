public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] f = new int[nums.length]; // f[i] 代表以i为结尾的之前的最长子序列
        for(int i = 0; i < nums.length; i++){
            f[i] = 1;//初始化所有f为1，至少有一个以自己为最长。
        }
        
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i]){
                   f[i] = Math.max(f[j]+1, f[i]);
                }
            }
        }
        int result = 0;
        for(int i = 0; i <nums.length; i++){
            result = Math.max(result, f[i]);
        }
        return result;
    }
}