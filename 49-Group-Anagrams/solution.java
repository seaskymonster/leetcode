public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for(String s: strs){
            char[] array = s.toCharArray();
            Arrays.sort(array);
            //String sc = array.toString(); // 生成一个新的object，这个是错的。
            String sc = String.valueOf(array);
            if(map.containsKey(sc)){
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