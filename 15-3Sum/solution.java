public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length < 3 ){
            return result;
        }
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++){
            if(i >= 1 && nums[i] == nums[i-1]){ //第一个元素放过去的办法。
                continue;
            }
            int target = 0 - nums[i];
            int start = i+1; //这里不能出错。
            int end = nums.length -1;
            while(start < end){
                if(nums[start] + nums[end] == target){
                    List<Integer> path = new ArrayList<Integer>();
                    path.add(nums[i]); //这里不能出错；
                    path.add(nums[start]);
                    path.add(nums[end]);
                    result.add(new ArrayList<>(path));
                    start++;
                    end--;
                    while(start < end && nums[start] == nums[start-1]){ // while里面的while
                        start++; // 这里不能出错
                    }
                    while(start < end && nums[end] == nums[end+1]){
                        end--; //这里不能出错
                    }
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