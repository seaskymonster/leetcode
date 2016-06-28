// public class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         if(s == null || s.length() == 0 ) return 0;
//         if(s.length() == 1) return 1;
//         HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//         int length = 0;
//         int start = 0;
//         for( int i = 0 ; i < s.length(); i++){
//             if(map.containsKey(s.charAt(i))){
//                 if(map.get(s.charAt(i)) >= start){
//                   length = Math.max(length, i-start);
//                  start = map.get(s.charAt(i)) +1;
//                 }
//                 map.put(s.charAt(i), i);
//             }else{
//                 map.put(s.charAt(i), i);
//             }
//         }
//         if(start == s.length()-1){
//             return length;
//         }else{
//             return Math.max(s.length()-1-start+1, length);
//         }
//     }
// }

// public class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int n = s.length();
//         Set<Character> set = new HashSet<>();
//         int ans = 0, i = 0, j = 0;
//         while (i < n && j < n) {
//             // try to extend the range [i, j]
//             if (!set.contains(s.charAt(j))){
//                 set.add(s.charAt(j));
//                 ans = Math.max(ans, j - i +1);
//                 j++;
//             }
//             else {
//                 set.remove(s.charAt(i)); // why remove the s.charAt(i++); 这里是一点一点移动，一直到把 重复的语速删掉
//                 i++;
//             }
//         }
//         return ans;
//     }
// }

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int ans = 0, i = 0, j = 0; // i 是左边， j是右边
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!map.containsKey(s.charAt(j))){
                ans = Math.max(ans, j - i +1);
            }
            else {
                int pos = map.get(s.charAt(j));
                if(pos >= i){
                    i = pos + 1;
                }else{
                  ans = Math.max(ans, j - i +1); // 如果找到的比较小，就跟没找到是一样的。
                }
            }
            map.put(s.charAt(j), j);
            j++;
        }
        return ans;
    }
}

