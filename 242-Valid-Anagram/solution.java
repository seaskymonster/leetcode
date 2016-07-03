public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] map = new char[256];
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            map[s.charAt(i)-'a']++;
            if(map[s.charAt(i)-'a'] == 1) count++;

            map[t.charAt(i)-'a']--;
            if(map[t.charAt(i)-'a'] == 0) count--;
        }
        
        return count == 0;
        
    }
}