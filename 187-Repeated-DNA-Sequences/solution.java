public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<String>();
        if(s == null || s.length() < 10){
            return result;
        }
        HashSet<String> set = new HashSet<String>();
        for(int i = 0; i <= s.length()-10; i++){
            String tmp = s.substring(i, i+10);
            if(set.contains(tmp)){
                result.add(new String(tmp));
            }else{
                map.add(tmp);
            }
        }
        
        return result;
    }
}