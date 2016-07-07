public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        int pos = 0;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path;
        helper(result, path, pos, target, candidates);
        return result;
    }
    
    public void helper(List<List<Integer>> result, List<Integer> path, int pos, int target, int[] candidates){
        if(target == 0){
            result.add(new ArrayList(path));
        }
        if(target < 0){
            return;
        }
        for(int i = pos; i < candidates.length; i++){
            if(i > 0 && candidates[i] == candidates[i-1]){
                continue;
            }
            path.add(candidates[i]);
            helper(result, path, i, target-candidates[i], candidates);
            path.remove(path.size()-1);
        }
    }
}