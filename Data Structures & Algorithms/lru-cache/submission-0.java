class LRUCache {
    class Node{
        int value;
        Node next;
        Node prev;
        int key;
        Node(int key,int value){
            this.value = value;
            this.key = key;
        }
    }
    HashMap<Integer,Node>map ;
    int capacity;
    Node head;
    Node tail;
    
    public LRUCache(int capacity) {
        map = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        this.capacity = capacity;
        
        head.next = tail;
        tail.prev = head;
    }
    
    public void add(Node node){
        Node prevnode = tail.prev;
        prevnode.next = node;
        node.prev = prevnode;
        node.next = tail;
        tail.prev = node;
    }

    public void delete(Node node){
             node.prev.next = node.next;
             node.next.prev = node.prev;
    }

    public int get(int key) {
         if(!map.containsKey(key)) return -1;
         Node node = map.get(key);
         delete(node);
         add(node);
         return node.value;
    }
    
    public void put(int key, int value) {
           if(map.containsKey(key)){
                   Node node = map.get(key);
                   delete(node);
                   add(node);
                node.value = value;
                return;
           }
        map.put(key,new Node(key,value));
        Node node = map.get(key);
        add(node);
        if(map.size()>capacity){
            node = head.next;
            delete(node);
            map.remove(node.key);
        }
    }
}
