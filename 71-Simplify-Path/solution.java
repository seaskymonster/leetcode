public class Solution {
    public String simplifyPath(String path) {
        String[] sa = path.split("/");
        System.out.println("sa "+ sa);
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < sa.length; i++){
            if(sa[i].equals(".") || sa[i].equals("")){
                continue;
            }
            else if(sa[i].equals("..")){
                if(stack.isEmpty()){
                    continue;
                }else{
                    stack.pop();
                }
            }
            else{
                stack.push(sa[i]);
            }
        }
        
        Stack<String> tmp = new Stack<>();
        while(!stack.isEmpty()){
            tmp.push(stack.pop());
        }
        StringBuilder result = new StringBuilder();
        if(tmp.isEmpty()) return "/";
        
        while(!tmp.isEmpty()){
            result.append("/");
            result.append(tmp.pop());
        }
        return result.toString();
        
    }
}