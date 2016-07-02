public class Solution {
    public int romanToInt(String s) {
        if (s == null || s.length()==0) {
           return 0;
	    }
	    Map<Character, Integer> map = new HashMap<Character, Integer>();
	    m.put('I', 1);
	    m.put('V', 5);
	    m.put('X', 10);
	    m.put('L', 50);
	    m.put('C', 100);
	    m.put('D', 500);
	    m.put('M', 1000);
	    
	    int result = map.get(s.charAt(s.length()-1));
	    for(int i = s.length()-2; i >= 0; i--){
	        if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
	            result = result - map.get(s.charAt(i));
	        }else{
	            result = result + map.get(s.charAt(i));
	        }
	    }
	    
	    return result;
    }
}