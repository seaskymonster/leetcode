public class WordDistance {
    HashMap<String, List<Integer>> map;
    public WordDistance(String[] words) {
        map = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            if(map.containsKey(word)){
                map.get(word).add(i);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(word, list);
            }
        }
    }

    public int shortest(String word1, String word2) {
        List<Integer> l1 = map.get(word1);
        List<Integer> l2 = map.get(word2);
        int result = Integer.MAX_VALUE;
        int i = j = 0;
        while(i <= l1.length && j <= l2.length){
            int pos1 = l1.get(i);
            int pos2 = l2.get(j);
            if(pos1 < pos2){
                result = Math.min(result, pos2 - pos1);
                i++;
            }else{
                result = Math.min(result, pos1 - pos2);
                j++;
            }
        }
        result = result == Integer.MAX_VALUE ? -1 : result;
        return result;
    }
}

// Your WordDistance object will be instantiated and called as such:
// WordDistance wordDistance = new WordDistance(words);
// wordDistance.shortest("word1", "word2");
// wordDistance.shortest("anotherWord1", "anotherWord2");