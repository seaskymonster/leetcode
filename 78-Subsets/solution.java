public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> result = new ArrayList<>();
      if(nums.length == 0) {
          return result;
      }
      List<Integer> path = new ArrayList<Integer>(); // why this need to be initialized ?
      int pos = 0;
      helper(nums, pos, path, result);
      return result;
    }
    
    public void helper(int[] nums, int pos, List<Integer> path, List<List<Integer>> result){
        result.add(new ArrayList(path)); // 这个地方一定要用new
        for(int i = pos; i < nums.length; i++){
            path.add(nums[i]);
            helper(nums, i+1, path, result);
            path.remove(path.size()-1);
        }
    }
   
}