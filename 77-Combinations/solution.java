public class Solution {
    public List<List<Integer>> combine(int n, int k) {
      List<List<Integer>> result = new ArrayList<>();
      if(n < k){
          return result;
      }
      List<Integer> path = new ArrayList<Integer>();
      int pos = 1;
      helper(result, path, pos, n, k);
      return result;
    }
    
    public void helper(List<List<Integer>> result, List<Integer> path, int pos, int n, int k){
        if(k == 0){
            result.add(new ArrayList(path));
        }
        for(int i = pos; i <= n; i++){
            path.add(i);
            helper(result, path, i+1, n, k-1);
            path.remove(path.size()-1);
        }
    }
    
    
}