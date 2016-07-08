public class Solution {
    public int search(int[] nums, int target) {
        int start, end, mid;
        start = 0;
        end = nums.length - 1;
        while(start + 1 < end){
            mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > nums[start]) { // mid 是在断点的左边，还是右边。 这种事左边。
                if(nums[start] <= target && nums[mid] >= target){ // 判断target是不是在start 和mid之间。
                    end = mid;
                }else{
                    start = mid;
                }
            }else{ // mid 在断点的右边
                if(nums[mid] <= target && nums[end] >= target) { // target 在mid 和end之间。
                    start = mid;
                }else {
                    end = mid;
                }
            }
        }
        if(nums[start] == target) {
            return start;
        }else if (nums[end] == target) {
            return end;
        }else {
            return -1;
        }
    }
}