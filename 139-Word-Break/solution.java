public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
       boolean[] word = new boolean [s.length()+1];// word[i] means substring from 0 to i is a perfect word
                                                  // 0 到 i-1是完美word
       word[0] = true;
       for(int i = 1; i <= s.length(); i++){ // 判断， 前1个（不包括1）， 前2个，。。前n+1个是不是完美word
           for(int j = 0; j < i ; j++){// 要从0开始，到 i-1
               if(!word[j]){
                   continue;
               }else{
                   if(wordDict.contains(s.substring(j, i))){ // 如果前j个（0到j-1） 是完美word， 并且 j 到 i-1 是完美word，返回true， 注意 substring（j，i） 是指string（j 到 i-1）。。
                       word[i] = true;
                       break;
                   }
               }
           }
       }
       return word[word.length-1];
    }
}