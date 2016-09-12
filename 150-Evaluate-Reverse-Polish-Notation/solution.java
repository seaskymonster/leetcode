public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for(String str: tokens){
            if(!(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/"))){
                stack.push(str);
            }else{
                int a = stack.pop();
                int b = stack.pop();
                if(str.equals("+")) {
                    stack.push(b + a);
                } else if(str.equals("-")) {
                    stack.push(b - a);
                } else if(str.equals("*")) {
                    stack.push(b * a);
                } else {
                    stack.push(b / a);
               }
            }
        }
        return stack.pop();
    }
}