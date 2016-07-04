public class Solution {
    public void wiggleSort(int[] nums) {
        for(int i = 1 ; i < nums.length; i++){
            if(i%2 == 0){
                if(nums[i] > nums[i-1]){
                    swap(nums, i-1, i);
                }
            }else{
                if(nums[i] < nums[i-1]){
                    swap(nums, i-1, i);
                }
            }
        }
    }
    
    public void swap(int[] nums, int start, int end){
        int tmp = nums[end];
        nums[end] = nums[start];
        nums[start] = tmp;
    }
}