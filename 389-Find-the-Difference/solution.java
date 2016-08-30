public class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[128];
        for(int i = 0; i < t.length(); i++){
            count[t.charAt(i) - 'a']++;
            count[s.charAt(i) - 'a']--;
        }
        for(int j =0; j < 128; j++){
            if(count[j] == 1){
                return (char)(j+'a');
            }
        }
        
        return t.charAt(t.length());
        
        
    }
}