public class LRUCache {
    
    HashMap<Integer, Node> cache;
    int capacity;
    int count;
    Node head;
    Node tail;
    
    public LRUCache(int capacity) {
        cache = new HashMap<>();
        this.capacity = capacity;
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.pre = head;
        count = 0;
    }
    
    public void deleteNode(Node node){
        Node pre = node.pre;
        Node next = node.next;
        pre.next = next;
        next.pre = pre;
    }
    
    public void moveToHead(Node node){
        Node headnext = head.next;
        head.next = node;
        node.pre =  head;
        node.next = headnext;
        headnext.pre = node;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            Node tmp = cache.get(key);
            deleteNode(tmp);
            moveToHead(tmp);
            return tmp.val;
        }else{
            return -1;
        }
    }
    
    public void set(int key, int value) {
        if(cache.containsKey(key)){
            Node tmp = cache.get(key);
            tmp.val = value;
            deleteNode(tmp);
            moveToHead(tmp);
            return;
        }else{
            if(count == capacity){
                Node removeNode = tail.pre;
                deleteNode(removeNode);
                cache.remove(removeNode.key);

            }else{
                count++;
            }
                Node newNode = new Node(key, value);
                cache.put(key, newNode);
                moveToHead(newNode);
        }
    }
}


 class Node{
    Node pre;
    Node next;
    int key;
    int val;
    
    Node(int key, int val){
        this.key = key;
        this.val = val;
    }
}