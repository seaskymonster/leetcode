public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        for(int i =0 ;i < haystack.length(); i++){
           int j = 0;
           int k = i;
           while(j < needle.length() && k < haystack.length()){
               if(haystack.charAt(k) == needle.charAt(j)){
                   j++;
                   k++;
               }else{
                   break;
               }
           }
           if(j == needle.length()) return i;
        }
        return -1;
    }
}