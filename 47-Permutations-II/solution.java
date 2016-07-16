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
        if(list.size() == nums.length){
            result.add(new ArrayList(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(visit[i] == 1 || (i != 0 && nums[i] == nums[i-1] && visit[i-1] == 0)){
                // 没明白为啥要加最后 那个visit[i-1] == 0
                continue;
            }
            visit[i] = 1;
            list.add(nums[i]);
            helper(result, list, visit, nums);
            list.remove(list.size()-1);
            visit[i] = 0;
        }
    }
    
}