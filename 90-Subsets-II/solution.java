public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int pos = 0;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<Integer>();
        helper(nums, pos, path, result);
        return result;
    }
    
    public void helper(int[] nums, int pos, List<Integer> path, List<List<Integer>>result ){
        result.add(new ArrayList(path));
        for(int i = pos; i < nums.length; i++){
            if(i!=pos && nums[i] == nums[i-1]){
                continue;
            }
            path.add(nums[i]);
            helper(nums, i+1, path, result);
            path.remove(path.size()-1);
        }
    }
    
}