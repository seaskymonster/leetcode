public class Solution {
    public int removeElement(int[] nums, int val) {
       int i = 0;
       int j = 0;
       while(j <= nums.length -1){
           if(nums[j] == val){
               j++;
           }else{
               nums[i] = nums[j];
               i++;
               j++;
           }
       }
       return i;
    }
 
}