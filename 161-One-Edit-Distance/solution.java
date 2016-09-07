public class Solution {
    public boolean isOneEditDistance(String s, String t) {
        int slength = s.length();
        int tlength = t.length();
        if(Math.abs(slength - tlength) > 1) return false;
        if(slength == tlength) return oneModify(s, t);
        if(slength > tlength) return oneDelete(s, t);
        else return oneDelete(t, s);
    }
    
    public boolean oneModify(String s, String t){
        int diff = 0;
        for(int i =0, j= 0; i< s.length()  &&j < t.length(); i++, j++){
            if(s.charAt(i) != t.charAt(j)){
                diff++;
            }
        }
        return diff == 1;
    }
    
    public boolean oneDelete(String s, String t){
         for(int i =0, j= 0; i< s.length()  && j < t.length(); i++, j++){
            if(s.charAt(i) != t.charAt(j)){
               return s.substring(i+1).equals(t.substring(j));
            }
        }
        return true;
    }
}