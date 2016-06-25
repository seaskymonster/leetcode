public class Solution {
    public void rotate(int[] nums, int k) {
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        
    }
    
    public void reverse(int[] nums, int from, int to){
        while(from < to){
            int tmp = nums[from];
            nums[from] = nums[to];
            nums[to] = tmp;
        }
    }
}