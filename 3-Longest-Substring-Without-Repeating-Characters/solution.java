public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int length = 0;
        int start = 0;
        for( int i = 0 ; i < s.length(); i++){
            if(map.containsKey(s.charAt(i)){
                if(map.get(s.charAt(i) >= start){
                  length = Math.max(length, i-start);
                 start = i;
                }
                map.put(s.charAt(i), i);
            }else{
                map.put(s.charAt(i), i);
            }
        }
        if(start == s.length()-1){
            return length;
        }else{
            return Math.max(s.length()-1-start+1, length);
        }
    }
}