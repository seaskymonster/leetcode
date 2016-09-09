public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        int pos = 0;
        String first = strs[0];
        while(pos < first.length()){
           for(int i = 1; i < strs.length; i++){
              if(pos >= strs[i].length() || strs[i].charAt(pos) != first.charAt(pos)){
                 return first.substring(0, i);
              }
           }
           pos++;
        }
        return first;
    }
}