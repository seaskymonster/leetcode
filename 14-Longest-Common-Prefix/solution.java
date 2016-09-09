public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        int pos = 0;
        String first = strs[0];
        while(pos < first.length()){
            System.out.println("pos"+pos);
           for(int i = 1; i < strs.length; i++){
              if(pos >= strs[i].length() || strs[i].charAt(pos) != first.charAt(pos)){
                  if(pos == 0){
                      return "";
                  }else{
                      return first.substring(0, pos);
                  }
              }
           }
           pos++;
        }
        return first;
    }
}

