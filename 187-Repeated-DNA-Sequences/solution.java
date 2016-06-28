public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<String>();
        if(s == null || s.length() < 10){
            return result;
        }
        HashMap<String, Integer> map = new HashMap<String, Integer>();
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
    
    //一开始用hashset做的，但是呢，set不能统计个数，只是看有没有这个substring，所以有的substring出现多余两次，就会在结果中有重复的，所以最后用hashmap统计次数，当取出来的次数是1的时候，我们才能往result里面加入这个string
}