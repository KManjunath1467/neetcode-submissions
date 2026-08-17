class Solution {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        // 1. Find middle
        ListNode p1 = head;
        ListNode p2 = head;

        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }

        // 2. Reverse second half
        ListNode sec = p1.next;
        p1.next = null;

        ListNode prev = null;

        while (sec != null) {
            ListNode temp = sec.next;

            sec.next = prev;
            prev = sec;
            sec = temp;
        }

        // prev = head of reversed second half

        // 3. Merge
        ListNode first = head;
        sec = prev;

        while (sec != null) {

            ListNode temp1 = first.next;
            ListNode temp2 = sec.next;

            first.next = sec;
            sec.next = temp1;

            first = temp1;
            sec = temp2;
        }
    }
}