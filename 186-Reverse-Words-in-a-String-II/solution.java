public class Solution {
    public void reverseWords(char[] s) {
        int i = 0;
        int j = 0;
        while(j < s.length){
            while(j < s.length && s[j] != ' '){
                j++;
            }
            reverse(s, i, j-1);
            System.out.println("j "+j);
            i = j+1;
        }
        
        reverse(s, 0 , s.length-1);
    }
    
    private void reverse(char[] s, int i, int j) {
        while (i < j) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
    }
}