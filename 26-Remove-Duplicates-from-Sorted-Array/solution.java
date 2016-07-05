public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length < 1){
            return 0;
        }
        int pt = 1;
        int i = 1;
        while(i < nums.length){
            if(nums[i] == nums[i-1]){
                i++;
            }else{
               nums[pt] = nums[i];
               pt++;
               i++;
            }
        }
        return pt;
  
    }
}