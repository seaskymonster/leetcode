public class Solution {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<String> result = new Stack<>();
        
        int i = 0;
        result.push("");
        while(i < s.length()){
            char cur = s.charAt(i);
            if(cur -'0' >= 0 && cur -'0' <= 9){
                int start = i;
                while(s.charAt(i+1) -'0' >= 0 && s.charAt(i+1)-'0' <= 9) {
                    i++;
                }
                System.out.println("i "+ i);
                count.push(Integer.parseInt(s.substring(start, i+1)));
            }else if(cur == '['){
                result.push("");
            }else if(cur == ']'){
                String str = result.pop();
                System.out.println("str "+ str);
                
                StringBuilder sb = new StringBuilder();
                int times = count.pop();
                 System.out.println("times "+ times);

                for(int j = 0; j < times; j++){
                    sb.append(str);
                }
                result.push(result.pop() + sb.toString());
            }else{
                String tmp = result.pop();
                tmp = tmp + cur;
                result.push(tmp);
            }
            i++;
        }
        return result.pop();
    }
}