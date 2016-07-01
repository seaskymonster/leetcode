public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for(String s: strs){
            char[] array = s.toCharArray();
            Arrays.sort(array);
            String sc = array.toString();
            if(map.contains(sc)){
                List<String> list = map.get(sc);
                list.add(s);
                map.put(sc, list);
            }else{
                List<String> path = new ArrayList<String>();
                path.add(s);
                map.put(sc, path);
            }
        }
        
        List<List<String>> result = new ArrayList<>();
        for(String key : map.keySet()){
            List<String> cur = map.get(key);
            Collections.sort(cur);
            result.add(cur);
        }
        return result;
    }
}