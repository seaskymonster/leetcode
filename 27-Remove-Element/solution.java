public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return nums;
        }
        int pt1 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[pt1] = nums[i];
                pt1++;
            }
        }
        return pt1;
    }
}