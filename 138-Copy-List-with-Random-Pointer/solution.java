/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        // 我们可以用hashmap存 old node - new node， 那样的话，第二遍扫描的时候，我们可以根据 原来list找到random node， 然后对应找到新的node
        if(head == null){
            return null;
        }
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode newhead = new RandomListNode(head.label);
        map.put(head, newhead);
        RandomListNode pre = newhead;
        RandomListNode node = head.next;
        while(node != null){
            RandomListNode newnode = new RandomListNode(node.label);
            map.put(node, newnode);
            pre.next = newnode;
            pre = newnode;
            node = node.next;
        }
        
        RandomListNode newnode = newhead;
        node = head;
        while(node != null){
            newnode.random = map.get(node.random);
            newnode = newnode.next;
            node = node.next;
        }
        return newhead;
    }
}