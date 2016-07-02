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
         ListNode dummy = new ListNode(0);
                 ListNode fast = dummy;

        dummy.next = head;
        for (int i = 1; i <= n; i++){  // 先从dummy 找到第n个，如果第n个是null，说明这个list长度不够
            if(fast == null){
                return null;
            }
            fast = fast.next;
        }
        
        ListNode slow = dummy; // slow 一定要从dummy 开始。
        while(fast.next != null){// 算好到哪个node停下。
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}