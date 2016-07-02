/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        int k = m;
        while(m > 1){
            if(head == null){
                return null;
            }
            head = head.next;
            m--;
        }
        
        ListNode prenode = head;
        ListNode mnode = head.next;
        ListNode nnode = mnode;
        ListNode postnnode = mnode.next;
        
        for(int i = k; i < n; i++){
            if(postnnode == null){
                return null;
            }
            ListNode tmp = postnnode.next;
            postnnode.next = nnode;
            nnode = postnnode;
            postnnode = tmp;
        }
        
        mnode.next = postnnode;
        prenode.next = nnode;
        return dummy.next;
        
    }
}