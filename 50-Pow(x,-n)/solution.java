public class Solution {
    public double myPow(double x, int n) {
        if(n < 0){
            return 1.0/pow(x, 0-n);
        }else{
            return pow(x,n);
        }
    }
    
    
    public double pow(double x, int n){
        if(n == 0) return 1; // 这个是终止条件。
        double half = pow(x, n/2);
        if(n % 2 == 0){
            return half*half;
        }else{
            return half*half*x;
        }
    }
}