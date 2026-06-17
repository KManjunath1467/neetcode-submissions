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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode start = new ListNode(-1);
        ListNode ptr = start;
        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                ptr.next = new ListNode(list1.val);
                ptr = ptr.next;
                list1 = list1.next;
            }
            else{
                ptr.next = new ListNode(list2.val);
                ptr = ptr.next;
                list2 = list2.next;
            }
        }
        while(list1!=null){
            ptr.next = new ListNode(list1.val);
            ptr = ptr.next;
            list1 = list1.next;
        }
        while(list2!=null){
            ptr.next = new ListNode(list2.val);
            ptr = ptr.next;
            list2 = list2.next;
        }
        return start.next;
    }
}