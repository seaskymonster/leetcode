public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        int length = 0;
        int pointer = 0;
        for(int i =0 ;i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                int tmp = map.get(s.charAt(i));
                if(tmp >= pointer){
                    pointer = tmp +1;
                }
            }
            length = Math.max(length, i-pointer+1);
            map.put(s.charAt(i), i);
        }
        return length;
    }
}