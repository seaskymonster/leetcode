public class Solution {
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length();
        int l2 = needle.length();
        if(l1 < l2) return -1;
        if(l2 == 0) return 0;
        
        for(int i =0 ;i < l1; i++){
           int j = 0;
           int k = i;
           while(j < l2 && k < l1){
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