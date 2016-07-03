public class Solution {
    public void moveZeroes(int[] nums) {
       int pt = 0;
       for(int i = 0; i < nums.length; i++){
           if(nums[i] == 0){
               continue;
           }else{
               if(pt == i){
                   pt++;
               }else{
                   nums[pt] = nums[i];
                   nums[i] = 0;
                   pt++;
               }
           }
       }
    }
}