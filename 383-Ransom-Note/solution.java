public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int[] count = new int[128];
       for(int i = 0; i < magazine.length(); i++){
           count[magazine.charAt(i) - 'a']++;
       }
       for(int j = 0; j < ransomNote.length(); j++){
           if(count[ransomNote.charAt(j)-'a'] <= 0){
               return false;
           }else{
              count[ransomNote.charAt(j)-'a']--; 
           }
       }
       return true;
    }
}