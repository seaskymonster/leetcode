public class Solution {
    public int addDigits(int num) {
       while(num/10 >= 1){
           num = sumDigits(num);
       }
       return num;
    }
    
    public int sumDigits(int num) {
       if(num < 10){
           return num;
       }
       return num%10 + addDigits(num/10);
    }
}