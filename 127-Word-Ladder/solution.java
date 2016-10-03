public class Solution {
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        HashSet<String> set = new HashSet<>();
        set.add(beginWord);
        
        int length = 1;
        
        while(!q.isEmpty()){
            length++;
            int size = q.size();
            for(int i = 0; i < size; i++){
                String tmp = q.poll();
                ArrayList<String> possible = getPossible(tmp, wordList);
                for(String str: possible){
                    if(endWord.equals(str)) return length;
                    if(!set.contains(str)){
                        q.offer(str);
                        set.add(str);
                    }
                }
             }
        }
        return 0;
    }
    public String replace(String s, int i, char j){
        char[] ca = s.toCharArray();
        ca[i] = j;
        return new String(ca);
    }
    public ArrayList<String> getPossible(String s, Set<String> wordList){
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            for(char j = 'a'; j <= 'z'; j++){
                String p = replace(s, i, j);
                if(wordList.contains(p)){
                    result.add(p);
                }
            }
        }
        return result;
    }
}