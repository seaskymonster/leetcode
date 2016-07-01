public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length <= 3 ){
            return result;
        }
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++){
            int target = 0 - nums[i];
            int start = i+1; //这里不能出错。
            int end = nums.length -1;
            while(start < end){
                if(nums[start] + nums[end] == target){
                    List<Integer> path = new ArrayList<Integer>();
                    path.add(target);
                    path.add(nums[start]);
                    path.add(nums[end]);
                    result.add(new ArrayList<>(path));
                }else if(nums[start] + nums[end] > target){
                    end--;
                }else{
                    start++;
                }
            }
        }
       return result;
    }
}