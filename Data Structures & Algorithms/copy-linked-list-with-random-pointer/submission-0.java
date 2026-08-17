/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return head;
        Node curr = head;
        HashMap<Node,Node>map = new HashMap<>();
        while(curr!=null){
            map.put(curr,new Node(curr.val));
            curr = curr.next;
        }
        map.put(null,null);
        curr = head;
        while(curr!=null){
            Node obj = map.get(curr);
            obj.next = map.get(curr.next);
            obj.random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }
}
