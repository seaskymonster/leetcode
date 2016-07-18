public class Solution {
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        if(wordList == null) return 0;
        Queue<String> q = new ArrayList<String>();
        HashSet<String> set = new HashSet<String>();
        q.offer(beginWord);
        set.add(beginWord);
        int lenght = 1;
        
        while(!q.isEmpty()){
            length++;
            int size = q.size();
            for(int i = 0; i < size; i++){
                String cur = q.poll();
                for(String s : getNextWords(cur, wordList)){
                    if(set.contains(s)){
                        continue;
                    }
                    if(s.equals(endWord)){
                        return length;
                    }
                    q.offer(s);
                    set.add(s);
                }
            }
        }
        return 0;
    }
    public String replace (char c, int i, String word){
        char[] ca = word.toCharArray();
        ca[i] = c;
        return new String(ca);
    }
    public ArrayList<String> getNextWords(String word, Set<String> wordList){
        ArrayList<String> result = new ArrayList<String>();
        for(char c = 'a'; c <= 'z'; c++){
            for(int i = 0; i < word.length(); i++){
                String newword = replace(c, i, word);
                if(wordList.contains(newword)){
                    result.add(newword);
                }
            }
        }
        return result;
    }
}