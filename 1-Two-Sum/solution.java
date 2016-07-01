public class Solution {
    // public int[] twoSum(int[] nums, int target) {
    //     int[] result = new int[2];

    //     if(nums == null || nums.length <= 1){
    //         result[0] = result[1] = -1;
    //         return result;
    //     }
    //     Arrays.sort(nums);
    //     int i = 0;
    //     int j = nums.length - 1;
    //     while(i < j){
    //         if(nums[i] + nums[j] == target){
    //             result[0] = i;
    //             result[1] = j;
    //             return result;
    //         }else if(nums[i] + nums[j] > target){
    //             j--;
    //         }else{
    //             i++;
    //         }
    //     }
        
    //     result[0] = result[1] = -1;
    //     return result;
    // }
    
      public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        if(nums == null || nums.length <= 1){
            result[0] = result[1] = -1;
            return result;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int newtarget = target - nums[i];
            if(map.containsKey(newtarget)){
                result[0] = map.get(newtarget);
                result[1] = i;
                return result;
            }else{
                map.put(nums[i], i);
            }
        }
        result[0] = result[1] = -1;
        return result;
    }
}