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
        if(list1 == null && list2 == null) return null;
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode p3 = new ListNode(-1);
        ListNode head = p3;

        while(list1!=null && list2!=null){
              if(list1.val <= list2.val){
                  p1 = p1.next;
                  p3.next = list1;
                  list1 = p1;
              }else{
                  p2 = p2.next;
                  p3.next = list2;
                  list2 = p2;
              }
            p3 = p3.next;
        }
        if(list1 !=null) p3.next = list1;
        if(list2 != null) p3.next = list2;
        return head.next;
    }
}