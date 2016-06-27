public class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        
        int[] f = new int[nums.length]; // f[i] reprents the maximum the robber can get  at i.
        f[0] = nums[0];
        if(nums.length >1){
             f[1] = Math.max(nums[0], nums[1]);
        }
        if(nums.length > 2){
            for(int i = 2; i < nums.length; i++){
                if(f[i-1] == f[i-2]){
                    f[i] = f[i-1] + nums[i]; // this if is not necessary....
                }else{
                    f[i] = Math.max(f[i-1], f[i-2]+nums[i]);
                }
            }
        }
        return f[nums.length-1];
        
    }
}