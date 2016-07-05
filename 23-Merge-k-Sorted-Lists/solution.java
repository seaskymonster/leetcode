/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    private Comparator<ListNode> ListNodeComparator = new Comparator<ListNode>(){
        public int compare(ListNode l1, ListNode l2){
            if(l1 == null){
                return 1;
            }
            if(l2 == null){
                return -1;
            }
            return l1.val - l2.val;
        }
    };
 
    public ListNode mergeKLists(ListNode[] lists) {
       Queue<ListNode> pq = new PriorityQueue<ListNode>(lists.length, ListNodeComparator);
       for(int i = 0; i < lists.length; i++){
           if(lists[i] != null){
               pq.add(lists[i]);
           }
       }
       ListNode dummy = new ListNode(0);
       ListNode cur = dummy;
       while(!pq.isEmpty()){
           ListNode tmp = pq.poll();
           cur.next = tmp;
           cur = cur.next;
           if(tmp.next != null){
               pq.add(tmp.next);
           }
       }
       return dummy.next;
    }
}