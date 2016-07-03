public class Solution {
    public int removeElement(int[] nums, int val) {
       int pt = 0;
       for(int i = 0; i < nums.length; i++){
           if(nums[i] == val){
               continue;
           }else{
               if(pt == i){
                   pt++;
               }else{
                  nums[pt] = nums[i];
                  nums[i] = val;
                  pt++;
               }
           }
       }
       return pt;
    }
}