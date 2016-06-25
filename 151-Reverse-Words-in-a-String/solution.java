public class Solution {
    public String reverseWords(String s) {
        if(s == null || s.length() == 0 ){
            return "";
        }
        String[] sa = s.split(" ");// remove the empty space. so if the string before only includes empty string, it may return nothing at last.
        StringBuilder sb = new StringBuilder();
        for(int i = sa.length-1; i >= 0; i++){
            if(sa[i] != ""){
               sb.append(sa[i]).append(" ");
            }
        }
        return sb.length() == 0? "":sb.substring(0,sb.length()-1); // java substring not include the last.
    }
}