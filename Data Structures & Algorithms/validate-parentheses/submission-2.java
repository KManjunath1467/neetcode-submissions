class Solution {
    public boolean isValid(String s) {
        Stack<Character>stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '{' || ch =='(' || ch=='['){
                stk.push(ch);
            }else{
                if(stk.isEmpty()) return false;
                char top = stk.pop();
                if((ch == '}' && top != '{')||(ch == ']' && top!='[')||(ch==')' && top != '(')){
                   return false;
                }   
            }
        }
        if(stk.isEmpty()){
        return true;
         }
         return false;
    }
}
