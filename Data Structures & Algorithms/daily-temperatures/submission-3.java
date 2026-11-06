class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>stk = new Stack<>();
        int n = temperatures.length;
        int temp[] = new int[n];
        stk.push(0);
        for(int i=1;i<n;i++){
           while(!stk.isEmpty() && temperatures[stk.peek()] < temperatures[i]){
                   temp[stk.peek()] = i - stk.peek();
                   stk.pop();
           }
           stk.push(i);
        }
        return temp;
    }
}
