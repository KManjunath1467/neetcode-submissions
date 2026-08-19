class KthLargest {
    PriorityQueue<Integer>pq;
    int capacity;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        capacity = k;
        for(int num : nums){
              pq.offer(num);
        }
        while(pq.size() > k){
             pq.poll();
        }
    }
    
    public int add(int val) {
          pq.offer(val);
          while(pq.size() > capacity){
              pq.poll();
          }
        return pq.peek();
    }
}
