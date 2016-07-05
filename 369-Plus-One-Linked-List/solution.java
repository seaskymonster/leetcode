/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode plusOne(ListNode head) {
        if(head == null) return null;
        ListNode tail = reverse(head);
        ListNode cur = tail;
        int carry = 0;
        while(cur != null){
            int value = cur.val;
            cur.val = (value +1) % 10;
            carry = (value + 1)/10;
            cur = cur.next;
            if(carry == 0) break;
        }
        if(carry == 1){
            cur.next = new ListNode(1);
        }
        return reverse(tail);
        
    }
    
    public ListNode reverse(ListNode head) {
        if(head == null) return head;
        ListNode pre = null;
        while(head != null){
            ListNode tmp = head.next;
            head.next = pre;
            pre = head;
            head = tmp;
        }
        return pre;
    }
}