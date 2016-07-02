/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    private Comparator<ListNode> ListNodeComparator = new Comparator<ListNode>(){ // implement 一个comparator，然后重写compare函数
        public int compare(ListNode left, ListNode right){
            if(left == null){
                return 1;
            }else if(right == null){
                return -1;// -1 代表左边比右边小，所以给左边的node
            }
            return left.val - right.val;
            
            
            // 在compare里面， -1代表 left<right;   +1 代表 left>right
        }
    };
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) {
            return null;
        }
        
        Queue<ListNode> heap = new PriorityQueue<ListNode>(lists.length, ListNodeComparator);
        for(int i = 0; i < lists.length; i++){
           if (lists[i] != null) {
                heap.add(lists[i]);
            }
        }
        
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(!heap.isEmpty()){
            ListNode head = heap.poll();
            tail.next = head; 
            tail = head; //要移动 tail 指针
            if (head.next != null) {
                heap.add(head.next);
            }
        }
        
        return dummy.next;

    }
}