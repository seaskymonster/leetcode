// public class Solution { 这种做法有bug
//     public int findKthLargest(int[] nums, int k) {
//         int n = nums.length;
//         int p = partition(nums, 0, n - 1, n-k+1);
//         return nums[p];
//     }
    
    
//     private int partition(int[] nums, int left, int right, int k){
//         if(left >= right) return left;
//         int middle = left + (right-left)/2;
//         int pivot = nums[middle];
//         int i = left; 
//         int j = right;
//         while (i <= j) {
// 			while (i <= j && nums[i] < pivot) {
// 				i++;
// 			}
 
// 			while (i <= j && nums[j] > pivot) {
// 				j--;
// 			}
 
// 			if (i <= j) {
// 				int temp = nums[i];
// 				nums[i] = nums[j];
// 				nums[j] = temp;
// 				i++;
// 				j--;
// 			}
// 		}
		
// 		int m = j+1 - left + 1;
// 		if(m == k) return j+1;
// 		if(m > k){
// 		    return partition(nums, left, j, k);
// 		}else{
// 		    return partition(nums, i, right, k-m); // k -m 中的m是找左边有m个已经被去除。
// 		}
//     }
// }



public class Solution {
    // public int findKthLargest(int[] nums, int k) {
    //     int n = nums.length;
    //     PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k);
    //     for(int i = 0; i < nums.length; i++){
    //         pq.offer(nums[i]);
    //         if(pq.size() > k) {
    //             pq.poll();
    //         }
    //     }
        
    //     return pq.poll();
    // }
    
    public int findKthLargest(int[] nums, int k) {
       int start = 0;
       int end = nums.length -1;
       int position = nums.length - k +1; // the position th smallest.
       int p = partition(nums, start, end, position);
       return nums[p];
    }
    
    public int partition(int[] nums, int start, int end, int k){
        if(start == end) return start;
        int pivot = nums[(start + end)/2];
        int i = start;
        int j = end;
        while(i < j){
            while(i < j && nums[i] < pivot){
                i++;
            }
            
            while(i < j && nums[j] > pivot){
                j--;
            }
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        if( i +1 == k){
            return i;
        }else if(i + 1 < k){
            return partition(nums, i+1, end, k);
        }else{
            return partition(nums, start, i-1, k);
        }
    }
    
    
}