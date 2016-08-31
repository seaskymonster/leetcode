public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] a = str.split(" ");
        if(pattern.length() != a.length) return false;
        HashMap<Character, String> map = new HashMap<>();
        for(int i =0; i < pattern.length(); i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(a[i])) return false;
            }else{
                if(map.containsValue(a[i])) return false;
            }
            map.put(pattern.charAt(i), a[i]);
        }
        return true;
    }
}