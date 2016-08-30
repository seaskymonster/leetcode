public class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[128];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i)-'a']++;
        }
        for(int j =0; j<s.length(); j++){
            if(count[s.charAt(j)-'a'] == 1){
              return j;
            }
        }
        return -1;
    }
}