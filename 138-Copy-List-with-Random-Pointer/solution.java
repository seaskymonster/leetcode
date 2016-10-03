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
        if(head == null) return head;
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode cur = head;
        RandomListNode newHead = new RandomListNode(head.label);
        RandomListNode newCur = newHead;
        map.put(head, newHead);
        
        while(cur.next != null){
            newCur.next = new RandomListNode(cur.next.label);
            map.put(cur.next, newCur.next);
            cur = cur.next;
            newCur = newCur.next;
        }
        
        cur = head;
        newCur = newHead;
        
        while(cur != null){
            RandomListNode curRandom = cur.random;
            if(curRandom != null){
                RandomListNode newCurRandom = map.get(curRandom);
                newCur.random = newCurRandom;
            }
            cur = cur.next;
            newCur = newCur.next;
        }
        return newHead;
    }
}