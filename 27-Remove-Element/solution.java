public class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length -1;
        while(i < j){
            if(nums[i] == val){
                swap(nums, i ,j);
                j--;
            }else{
                i++;
            }
        }
    }
    
    public void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}