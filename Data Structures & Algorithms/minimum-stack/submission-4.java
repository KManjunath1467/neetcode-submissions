class MinStack {
   Stack<Integer>stk;
   Stack<Integer>minstk;
    public MinStack() {
        stk = new Stack();
        minstk = new Stack();
    }
    
    public void push(int val) {
        stk.push(val);
        if(minstk.isEmpty() || minstk.peek() >= val){
            minstk.push(val);
        }
    }
    
    public void pop() {
        int val = stk.pop();
        if(minstk.peek() == val){
              minstk.pop();
        }
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minstk.peek();
    }
}
