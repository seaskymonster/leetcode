public class Solution {
    public boolean canPermutePalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }
        int count = 0;
        for(Character c : map.keySet()){
            int nums = map.get(c);
            if(nums % 2 == 1){
                count++;
            }
        }
        
        return count <= 1;
    }
}