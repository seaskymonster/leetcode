/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int n) {
        if(head==null) return null;
        int length=1;
        ListNode ptr1=head;
        while(ptr1.next!=null){
            length++;
            ptr1=ptr1.next;
        }
        int k=n%length;
        if(k==0) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode ptr=dummy;
        while(length-k>0){
            ptr=ptr.next;
            k++;
        }
        dummy.next=ptr.next;
        ptr.next=null;
        ptr1.next=head;
        head=dummy.next;
        return head;
        
        
       
    }
}