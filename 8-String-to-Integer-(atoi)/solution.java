public class Solution {
    public int myAtoi(String str) {
        if(str == null || str.length() == 0){
            return  0;
        }
        str = str.trim();
        int sign = 1;
        int index = 0;
        if(str.charAt(0) == '+'){
            sign = 1;
            index++;
        }else if(str.charAt(0) == '-'){
            sign = -1;
            index++;
        }
        long val = 0;
        
        for(int i = index; i < str.length(); i++){
            if(str.charAt(i) - '0' <= 9 && str.charAt(i) - '0' >=0){
                val = val*10 + (str.charAt(i)-'0');
            }else{
                break;
            }
            if(val > Integer.MAX_VALUE){
                break;
            }
        }
        
        if(val*sign <= Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        if(val*sign >= Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        
        return (int)(val*sign);
        
    }
}