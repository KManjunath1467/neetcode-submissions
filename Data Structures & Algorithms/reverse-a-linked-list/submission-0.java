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
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode start = null;
        ListNode current = head;
        ListNode last = head.next;
        while(last!=null){
            current.next = start;
            start = current;
            current = last;
            last = last.next;
        }
        current.next = start;
        return current;
    }
}
