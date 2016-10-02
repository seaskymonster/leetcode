public class Solution {
    
    public boolean validHash(int[] targetHash, int[] sourceHash){
        for(int i = 0; i < targetHash.length; i++){
            if(sourceHash[i] < targetHash[i]) return false;
        }
        return true;
    }
    
    public void initializeHash(String str, int[] Hash){
        for(int i = 0; i < str.length(); i++){
            Hash[str.charAt(i) - '0']++;
        }
    }
    public String minWindow(String s, String t) {
        int[] sourceHash = new int[256];
        int[] targetHash = new int[256];
        initializeHash(t, targetHash);
        int minLength = Integer.MAX_VALUE;
        String result = "";
        int j = 0;
        
        for(int i =0; i < s.length(); i++){
            while(j < s.length() && !validHash(targetHash, sourceHash)){
                sourceHash[s.charAt(j) - '0']++;
                j++;
            }
            
            if(validHash(targetHash, sourceHash)){
                if(j - i < minLength){
                    minLength = Math.min(minLength, j-i);
                    result = s.substring(i,j);
                }
            }
            sourceHash[s.charAt(i) - '0']--;
        }
        return result;
    }
}