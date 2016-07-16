public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null  || nums.length == 0){
            return result;
        }
        List<Integer> list = new ArrayList<>();
        helper(result, list, nums);
        return result;
    }
    
    public void helper(List<List<Integer>> result, List<Integer> list, int[] nums){
        if(list.size() == nums.length){
            result.add(new ArrayList(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                helper(result,list,nums);
                list.remove(list.size()-1);
            }
        }
    }
}