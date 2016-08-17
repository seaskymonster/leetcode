public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper(result, "", n, n);
        return result;
    }
    
    public void helper(List<String> result, String s, int left, int right){
        if(left > right) return;
        if(left == 0 && right == 0){
            result.add(s);
            return;
        }
        if(left > 0){
            helper(result, s+"(", left-1, right);
        }
        if(right > 0){
            helper(result, s+")", left, right -1);
        }
    }
}