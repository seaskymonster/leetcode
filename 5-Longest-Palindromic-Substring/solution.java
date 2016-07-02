public class Solution {
    public String longestPalindrome(String s) {
        int start = 0; 
        int end = 0;
        for(int i = 0; i < s.length(); i++){
            int len1 = expendfromcenter(s, i, i);
            int len2 = expendfromcenter(s, i, i+1);
            int len = Math.max(len1, len2);
            
            if(end-start+1< len){
                if(len %2 == 0){
                    start = i - (len-2)/2;
                    end = i + len/2;
                }else{
                    start = i- (len-1)/2;
                    end = i + (len-1)/2;
                }
            }
        }
        return s.substring(start, end+1);
    }
    
    private int expendfromcenter(String s, int l, int r){
        while(l >= 0 && r <= s.length()-1 && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r-l+1-2;
    }

}