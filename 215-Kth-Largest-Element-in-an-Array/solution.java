public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        int p = partition(nums, 0, n - 1, n-k+1);
        return nums[p];
    }
    
    
    private int partition(int[] nums, int left, int right, int k){
        int middle = left + (right-left)/2;
        int pivot = nums[middle];
        int i = left; 
        int j = right;
        while (i <= j) {
			while (i <= j && nums[i] < pivot) {
				i++;
			}
 
			while (i <= j && nums[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
				j--;
			}
		}
		
		int m = j - left + 1;
		if(m == k) return j;
		if(m > k){
		    return partition(nums, left, j-1, k);
		}else{
		    return partition(nums, j+1, right, k-m); // k -m 中的m是找左边有m个已经被去除。
		}
    }
}