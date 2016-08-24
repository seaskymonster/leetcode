public class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if(s == null || s.length() == 0) return 0;
        int j = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int distinctsize = 0;
        int result = Integer.MIN_VALUE;
        for(int i =0; i < s.length(); i++){
            while((distinctsize <= k -1) && (j < s.length())){
                if(map.containsKey(s.charAt(j))){
                    if(map.get(s.charAt(j)) >= i){
                        continue;
                    }else{
                        distinctsize++;
                    }
                }else{
                    distinctsize++;
                }
                map.put(s.charAt(j), j);
                j++;
            }
            result = Math.max(j-i+1, result);
            i++;
        }
        return result == Integer.MIN_VALUE ? 0 : result;
    }
}