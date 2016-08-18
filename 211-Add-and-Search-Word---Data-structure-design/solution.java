public TrieNode {
    char c;
    TrieNode[] children;
    boolean isWord;
    
    public TrieNode(){
        children = new TrieNode[26];
    }
    
    public TrieNode(c){
        this.c = c;
        children = new TrieNode[26];
    }
    
    public boolean containsKey(Character c){
        return children[c-'a'] != null; 
    }
    
    public TrieNode get(Character c){
        return children[c -'a'];
    }
    
    public TrieNode put(Character c){
        TrieNode node = new TrieNode(c);
        children[c-'a'] = node;
        return node;
    }
    
    
}


public class WordDictionary {
    TrieNode root;
    public WordDictionary(){
        root = new TrieNode();
    }
    // Adds a word into the data structure.
    public void addWord(String word) {
        TrieNode cur = root;
        
        for(int i = 0; i < word.length(); i++){
            Character tmp = word.charAt(i);
            if(cur.containsKey(tmp)){
                cur = cur.get(tmp);
            }else{
                cur = cur.put(tmp);
            }
        }
        cur.isWord = true;
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return searchHelper(word, root, 0);
    }
    
    public boolean searchHelper(String word, TrieNode cur, int index){
         if(index == word.length()){
             return cur.isWord;
         }
         boolean result = false;
         Character tmp = word.charAt(i);
             if(tmp == '.'){
                 for(TrieNode node: cur.children){
                     if(searchHelper(word, node, index+1)){
                         result = true;
                     }
                 }
             }else{
                 if(!cur.containsKey(tmp)){
                     return false;
                 }else{
                    return searchHelper(word, cur.get(tmp), index+1);
                 }
             }
         
    }
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");