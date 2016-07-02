public class Solution {
    public String reverseWords(String s) {
        if(s == null || s.length() == 0){
            return s;
        }
        String[] sa = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = s.length -1 ; i >= 0 ; i--){
            sb = sb + reverse(sa[i]) + " ";
        }
        return sb.substring(0, sb.length()-1);
    }
    
    public String reverse(String s) {
        if(s == null || s.length() == 0){
            return s;
        }
        char[] ca = s.toCharArray();
        int i = 0;
        int j = ca.length-1;
        while(i < j){
            char tmp = ca[i];
            ca[i] = ca[j];
            ca[j] = tmp;
            i++;
            j--;
        }
        return ca.toString();
    }
}