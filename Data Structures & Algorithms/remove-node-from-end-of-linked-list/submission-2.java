/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next==null) return null;
         ListNode ptr = new ListNode(-1);
         ptr.next = head;
         ListNode current = head;
         for(int i=0;i<n;i++){
            current = current.next;
         }
         while(current!=null){
            current = current.next;
            ptr = ptr.next;
         }
         if(ptr.val == -1){
            head = head.next;
         }else{
         ptr.next = ptr.next.next;
         }
         return head;
    }
}
