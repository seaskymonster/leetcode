class TrieNode {
    // Initialize your data structure here.
    public TrieNode[] children;
    public boolean hasWord;
    
    public TrieNode() {
        children = new TrieNode[26];
        hasWord = false;
    }
}

public class Trie {
    public TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode cur = root;
        for(int i = 0; i < word.length(); i++){
            Character tmp = word.charAt(i);
            if(cur.children[tmp - 'a'] == null){
                cur.children[tmp - 'a'] = new TrieNode();
            }
             cur = cur.children[tmp - 'a'];

        }
        cur.hasWord = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode cur = root;
        for(int i = 0; i < word.length(); i++){
            Character tmp = word.charAt(i);
            if(cur.children[tmp - 'a'] == null){
              return false;
            }else{
             cur = cur.children[tmp - 'a']; // 这行容易错。
            }
        }
        return cur.hasWord;
        
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
         TrieNode cur = root;
        for(int i = 0; i < prefix.length(); i++){
            Character tmp = prefix.charAt(i);
            if(cur.children[tmp - 'a'] == null){
              return false;
            }else{
             cur = cur.children[tmp - 'a'];
            }
        }
        return true;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");