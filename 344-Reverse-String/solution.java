public class Solution {
    public String reverseString(String s) {
        char tmp;
        char[] r = s.toCharArray();
        int i =0;
        int j = s.length()-1;
       while(i< s.length()/2){
          tmp = r[i];
          r[i] = r[j];
          r[j] = tmp;
          i++;
          j--;
       }
       
       return String.valueOf(r);
    }
}