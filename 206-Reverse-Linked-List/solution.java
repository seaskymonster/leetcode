/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
//   public ListNode reverseList(ListNode head) {
//      if(head == null) return null;
//      if(head.next == null) return head;
//      ListNode cur = head.next;
//      ListNode root = reverseList(cur);
//      cur.next = head;
//      head.next = null;
//      return root;
//   }

 public ListNode reverseList(ListNode head) { //记住这个，这个以后要有很多地方要用。
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