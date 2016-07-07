public class Solution {
    public boolean isUgly(int num) {
        if(n <= 0) return false;
        while(num % 2 == 0){
            num = num/2;
        }
        while(num % 3 == 0){
            num = num/3;
        }
        
        while(num % 5 == 0){
            num = num/5;
        }
        return num == 1;
    }
}