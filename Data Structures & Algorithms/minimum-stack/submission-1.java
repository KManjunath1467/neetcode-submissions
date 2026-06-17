class MinStack {
     Stack<Integer>stk;
     PriorityQueue<Integer>pq;

    public MinStack() {
       stk = new Stack<>();
       pq = new PriorityQueue<>(); 
    }
    
    public void push(int val) {
        stk.push(val);
        pq.offer(val);
    }
    
    public void pop() {
        int val = stk.pop();
        pq.remove(val);
    }
    
    public int top() {
         return stk.peek();
    }
    
    public int getMin() {
         return pq.peek();
    }
}
