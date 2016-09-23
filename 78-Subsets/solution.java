public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        Arrays.sort(nums);
        dfs(result, path, 0, nums);
        return result;
    }
    
    public void dfs(List<List<Integer>> result, List<Integer> path, int pos, int[] nums){
        if(pos >= nums.length) return;
        if(path != null){
           result.add(new ArrayList<>(path));
        }
        for(int i = pos; i < nums.length; i++){
            path.add(nums[i]);
            dfs(result, path, pos+1, nums);
            path.remove(path.length()-1);
        }
    }
}