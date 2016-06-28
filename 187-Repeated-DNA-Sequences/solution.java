public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<String>();
        if(s == null || s.length() < 10){
            return result;
        }
        HashMap<String, Integer> map = new HashSet<String, Integer>();
        for(int i = 0; i <= s.length()-10; i++){
            String tmp = s.substring(i, i+10);
            if(map.containsKey(tmp)){
                if(map.get(tmp) == 1){
                   result.add(new String(tmp));
                }
                map.put(tmp, map.get(tmp) + 1);
            }else{
                map.put(tmp, 1);
            }
        }
        
        return result;
    }
}