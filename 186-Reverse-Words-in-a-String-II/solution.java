public class Solution {
    public void reverseWords(char[] s) {
        int i = 0;
        int j = 0;
        while(j < s.length){
            while(j < s.length && s[j] != ' '){
                j++;
            }
            reverse(s, i, j);
            i++;
        }
    }
    
    private void reverse(char[] s, int i, int j) {
        while (i < j) {
            char tmp = s[i];
            s[i++] = s[j];
            s[j--] = tmp;
        }
    }
}