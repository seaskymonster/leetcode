public class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }else{
                Character cur = stack.pop();
                Character c = map.get(s.charAt(i));
                if(cur != c){
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}