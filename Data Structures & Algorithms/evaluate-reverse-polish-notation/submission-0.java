class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack();
         for(String token : tokens){
            if(!isOperation(token)){
                stk.push(Integer.parseInt(token));
            }
            else{
                int op2 = stk.pop();
                int op1 = stk.pop();
                stk.push(operation(op1,token,op2));
            }
         }
         return stk.pop();
    }
    public int operation(int op1,String ch,int op2){
        switch(ch){
            case "+" : return op1+op2;
            case "-" : return op1-op2;
            case "/" : return op1/op2;
            case "*" : return op1*op2;
            default : throw new IllegalArgumentException(ch);
        }
    }
    private boolean isOperation(String token){
        return token.equals("*") || token.equals("+") || token.equals("/") || token.equals("-");
    }
}
