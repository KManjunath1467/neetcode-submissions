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
    public boolean hasCycle(ListNode head) {
          if(head == null || head.next == null) return false;
          ListNode p1 = head;
          ListNode p2 = head;
          while(p2.next != null && p2 !=null){
                  p1 = p1.next;
                  p2 = p2.next.next;
                  if(p2 == null) break;

                   if(p1 == p2 || p2.next == p1) return true;
          }
          return false;
    }
}
