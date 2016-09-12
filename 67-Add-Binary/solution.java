public class Solution {
    public String addBinary(String a, String b) {
        if(a.length() < b.length()){
            String tmp = b;
            b =a;
            a= tmp;
        }
        
        int pa = a.length()-1;
        int pb = b.length()-1;
        int carry = 0;
        String result = "";
        while(pb>=0){
            int sum = (int)(a.charAt(pa) - '0')+(b.charAt(pb) -'0')+carry;
            result = String.valueOf(sum%2) +result;
            carry = sum/2;
            pa--;
            pb--;
        }
        while(pa >= 0){
            int sum = (int)(a.charAt(pa) - '0') + carry;
            result = String.valueOf(sum%2) +result;
            carry = sum/2;
            pa--;
        }
        if(carry == 1){
            result = "1" + result;
        }
        return result;
    }
}