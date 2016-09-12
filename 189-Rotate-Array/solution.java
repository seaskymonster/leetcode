public class Solution {
    public void rotate(int[] nums, int k) {
        k = k%n;
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        return;
    }
    
    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = nums[start];
            start++;
            end--;
        }
        return;
    }
}