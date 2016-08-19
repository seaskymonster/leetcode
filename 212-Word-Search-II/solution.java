public class Solution {
    
    public class TrieNode{
        char c;
        boolean isWord;
        TrieNode[] children;
        
        TrieNode(){
           children = new TrieNode[26];
        }
        
        TrieNode(char c){
            this.c = c;
            children = new TrieNode[26];
        }
        
        public boolean containsKey(char c){
            return children[c-'a'] != null;
        }
        
        public TrieNode get(char c){
            return children[c - 'a'];
        }
        
        public TrieNode put(char c){
            TrieNode node = new TrieNode(c);
            children[c -'a'] = node;
            return node;
        }
    }
    
    public class TrieTree{
        TrieNode root ;
        TrieTree(){
            root = new TrieNode();
        }
        
       public void insert(String word){
            TrieNode cur = root;
            for(int i = 0; i < word.length(); i++){
                char tmp = word.charAt(i);
                if(!cur.containsKey(tmp)){
                    cur = cur.put(tmp);
                }else{
                    cur = cur.get(tmp);
                }
                
            }
            cur.isWord = true;
       }
       
       public boolean find(String word){
           TrieNode cur = root;
           for(int i =0; i < word.length(); i++){
               char tmp = word.charAt(i);
               if(!cur.containsKey(tmp)){
                   return false;
               }else{
                   cur = cur.get(tmp);
               }
           }
           return cur.isWord;
       }
        
    }
    public List<String> findWords(char[][] board, String[] words) {
        TrieTree tree = new TrieTree();
        for(String word: words){
            tree.insert(word);
        }
        
        int m = board.length;
        int n = board[0].length;
        List<String> result = new ArrayList<String>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                helper(result, tree.root, i, j, board, "");
            }
        }
        return result;
    }
    
    public void helper(List<String> result, TrieNode cur, int i, int j, char[][]board, String res){
        if(cur.isWord){
            if(!result.contains(res)){
                result.add(new String(res));
            }
        }
        int m = board.length;
        int n = board[0].length;
        if(i < 0 || j < 0|| i >=m || j >=n || board[i][j] == '*' || cur == null) return;
        char tmp = board[i][j];
        if(cur.containsKey(tmp)){
            board[i][j] = '*';
            helper(result, cur.get(tmp), i-1, j, board, res + tmp);
            helper(result, cur.get(tmp), i+1, j, board, res + tmp);
            helper(result, cur.get(tmp), i, j-1, board, res + tmp);
            helper(result, cur.get(tmp), i, j+1, board, res + tmp);
            board[i][j] = tmp;
        }
        return;
        
    }
}