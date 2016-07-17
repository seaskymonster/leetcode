public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        int pos = 0;
        List<String> list = new ArrayList<String>();
        helper(result, list, pos, s);
        return result;
    }
    
    public void helper(List<List<String>> result, List<String> list, int pos, String s){
        if(pos == s.length()){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i = pos; i < s.length(); i++){
            String prefix =s.substring(pos, i+1);
            if(isPalindrome(prefix)){
               list.add(prefix);
               helper(result, list, i+1, s);
               list.remove(list.size()-1);  
            }
        }
    }
    
    public boolean isPalindrome(String s){
        if(s == null || s.length() == 0) return false;
        int start = 0;
        int end = s.length() -1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
}