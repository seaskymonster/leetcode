/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode ptr = dummy;
        while(l1 != null && l2 != null){
            int sum = carry + l1.val + l2.val;
            carry = sum / 10;
            ptr.next = new ListNode(sum % 10);
            ptr = ptr.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while(l1 != null){
            int sum = carry + l1.val;
            carry = sum / 10;
            ptr.next = new ListNode(sum % 10);
            ptr = ptr.next;
            l1 = l1.next;
        }
        
        while(l2 != null){
            int sum = carry + l2.val;
            carry = sum / 10;
            ptr.next = new ListNode(sum % 10);
            ptr = ptr.next;
            l2 = l2.next;
        }
        
        if(carry == 1){
            ptr.next = new ListNode(1);
        }
        return dummy.next;
    }
}