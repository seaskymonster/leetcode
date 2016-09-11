public class Solution {
    public String countAndSay(int n) {
        String oldString = "1";
        for(int i = 1; i < n; i++){
            char[] oldChar = oldString.toCharArray();
            StringBuilder sb = new StringBuilder();
            int count = 0;
            
            for(int j = 0 ; j < oldChar.length; j++){
                if(j+1 < oldChar.length && oldChar[j] == oldChar[j+1]){
                    count++;
                }else{
                    sb.append(String.valueOf(++count));
                    sb.append(String.valueOf(oldChar[j]));
                    count =0;
                }
            }
            oldString = sb.toString();
        }
        return oldString;
    }
}