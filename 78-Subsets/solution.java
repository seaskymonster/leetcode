public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> result = new ArrayList<Integer>();
      if(nums.length == 0) {
          return result;
      }
      List<Integer> path;
      int pos = 0;
      helper(nums, pos, path, result);
      return result;
    }
    
    public void helper(int[] nums, int pos, List<Integer> path, List<List<Integer>> result){
        result.add(new ArrayList(path));
        for(int i = pos; i < nums.length; i++){
            path.add(nums[i]);
            helper(nums, i+1, path, result);
            path.remove(path.size()-1);
        }
    }
   
}