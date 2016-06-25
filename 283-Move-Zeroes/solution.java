public class Solution {
    public void moveZeroes(int[] nums) {
        int pt = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                if(pt != i){
                    nums[pt] = nums[i];
                    pt++;
                }else{
                    pt++;
                }
            }
        }
        for(int j = pt; j < nums.length; j++){
            nums[j] = 0;
        }
    }
}