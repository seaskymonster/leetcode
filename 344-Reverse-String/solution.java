public class Solution {
    public String reverseString(String s) {
        char[] ca = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = ca.length-1; i >= 0; i--){
            sb.append(ca[i]);
        }
        return new String(sb);
    }
}