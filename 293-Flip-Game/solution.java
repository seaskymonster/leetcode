public class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> result = new ArrayList<String>();
        if(s == null || s.length() <=1){
            return result;
        }
        
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                char[] array = s.toCharArray();
                if(array[i] == '+'){
                   array[i-1] = array[i] = '-';
                   result.add(String.valueOf(array));
                }
            }
        }
        return result;
    }
}