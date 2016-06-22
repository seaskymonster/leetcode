public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int bits = 0;
        while(n != 0){
            if((n & 1) == 1){ //the argument n is regarded as unsigned by us but signed by computer, so using "n % 2 == 1" to check if the lowest bit is 1 is wrong because it doesn't concern the highest bit indicate negative value. So we use "&" operation instead to check the lowest bit, and we use ">>>" (not ">>") to do logical shift right.
                bits++;
            }
            n = n>>>1;
        }
        return bits;
    }
}