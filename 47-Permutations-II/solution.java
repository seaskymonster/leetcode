public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return result;
        }
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        int[] visit = new int[nums.length];
        helper(result, list, visit, nums);
        return result;
    }
    
    public void helper(List<List<Integer>> result, List<Integer> list, int[] visit, int[] nums){
        if(list.size() == nums.size()){
            result.add(new ArrayList(list));
        }
        for(int i = 0; i < nums.length; i++){
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            helper(result, list, visit, nums);
            list.remove(list.size()-1);
        }
    }
    
}