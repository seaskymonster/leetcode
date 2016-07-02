/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // slow 就是predelete， 所以必须从dummy 开始
        ListNode fast = dummy;
         ListNode dummy = new ListNode(0);
        dummy.next = head;
        for (int i = 1; i <= n; i++){
            if(fast == null){
                return null;
            }
            fast = fast.next;
        }
        
        ListNode slow = dummy;
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}