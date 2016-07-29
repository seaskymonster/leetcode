public class Solution {
    public void sortColors(int[] nums) {
        int pt0 = 0;
        int pt1 = 0;
        int pt2 = nums.length-1;
        
        while(pt1 <= pt2){
            if(nums[pt1] == 0){
                swap(nums, pt0, pt1);
                pt0++;
                pt1++;
            }else if(nums[pt1] == 1){
                pt1++;
            }else{
                swap(nums, pt1, pt2);
                pt2--;
            }
        }
    }
    
    public void swap( int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}