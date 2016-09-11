/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    // public ListNode reverseList(ListNode head) {
    //   ListNode pre = null;
    //   while(head != null){
    //       ListNode tmp = head.next;
    //       head.next = pre;
    //       pre = head;
    //       head= tmp;
    //   }
    //   return pre;
    // }
    
       public ListNode reverseList (ListNode head) {
           // if head is null or only one node, it's reverse of itself.
          if ( (head==null) || (head.next == null) ) return head;
        // reverse the sub-list leaving the head node.
          ListNode reverse = reverseList(head.next);
        // head.next still points to the last element of reversed sub-list.
        // so move the head to end.
          head.next.next = head;
       // point last node to nil, (get rid of cycles)
            head.next = null;  // this is important ...这时候head.next还是有所指的，要清除。
           return reverse;
       }
}