public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
       boolean[] word = new boolean [s.length()+1];// word[i] means substring from 0 to i is a perfect word
       word[0] = true;
       for(int i = 1; i <= s.length(); i++){
           for(int j = 1; j <= i ; j++){
               if(!word[j]){
                   continue;
               }else{
                   if(wordDict.contains(s.substring(j, i))){
                       word[i] = true;
                       break;
                   }
               }
           }
       }
       return word[word.length()-1];
    }
}