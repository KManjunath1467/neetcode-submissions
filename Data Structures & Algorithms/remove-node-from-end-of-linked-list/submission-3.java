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
          int count = 0;
          ListNode ptr = head;
          while(ptr != null){
               ptr = ptr.next;
               count++;
          }
        if(count == n){
             return head.next;
        }
        int rem = count - n -1;
        int i = 0;
        ptr = head;
        while(i!=rem){
             ptr = ptr.next;
             i = i+1;
        }
        ptr.next = ptr.next.next;
        return head;
    }
}
