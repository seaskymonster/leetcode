public class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if(s == null || s.length() == 0) return 0;
        int j = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int distinctsize = 0;
        int result = Integer.MIN_VALUE;
        for(int i =0; i < s.length(); i++){
            while(j < s.length()){
                                // System.out.println("i " +i);
                                // System.out.println("j "+j);
                                // System.out.println("size "+distinctsize);

                if(map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) >= i){
                     map.put(s.charAt(j), j);
                }else{
                     if(distinctsize == k){
                        break;
                     }
                     map.put(s.charAt(j), j);
                     distinctsize++;
                }
             j++;

            }
            result = Math.max(j-1 -i +1, result);
            if(map.containsKey(s.charAt(i)) && (map.get(s.charAt(i)) == i)){
                distinctsize --;
            }
        }
        return result == Integer.MIN_VALUE ? 0 : result;
    }
}