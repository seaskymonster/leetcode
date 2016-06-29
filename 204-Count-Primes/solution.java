public class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        
        for(int i = 2; i < n ; i++){
            if(isPrime[i]){ // 如果当前数是prime，把他的2倍，3倍，4倍，扫一下，如果他不是prime，不用扫了，因为可以证明，他的2倍，3倍，4倍已经被扫过了。
                for(int j = i + i; j < n; j = j + i){
                    isPrime[j] = false;
                }
            }
        }
        
        int count = 0;
        for(int i = 2; i < n; i++){
            if(isPrime[i]){
                count++;
            }
        }
        return count;
    }
}