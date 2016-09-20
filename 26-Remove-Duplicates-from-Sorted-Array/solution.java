public class Solution {
    public int removeDuplicates(int[] nums) {
        int i =1;
        int j=1;
        while(j < nums.length){
            if(nums[j] == nums[j-1]){
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