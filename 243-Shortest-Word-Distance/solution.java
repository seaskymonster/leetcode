public class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int minlength = words.length;
        for(int i = 0; i < words.length; i++){
          if(words[i].equals(word1)){
              if(map.containsKey(word2)){
                  int pos = map.get(word2);
                  minlength = Math.min(minlength, i-pos);
              }
               map.put(word1, i);
             
          }else if(words[i].equals(word2)){
              if(map.containsKey(word1)){
                  int pos = map.get(word1);
                  minlength = Math.min(minlength, i-pos);
              }
                map.put(word2, i);
          }else{
              continue;
          }
        }
        return minlength;
    }
}