class Solution {
    public boolean isValid(String s) {
        Stack<Character>stk = new Stack<>();
        for(int i=0;i<s.length();i++){
              char ch1 = s.charAt(i);
              if(ch1 == '(' || ch1 == '[' || ch1 == '{'){
                  stk.push(ch1);
              }else{
                  if(stk.isEmpty()) return false;
                  char ch2 = stk.pop();
                  if((ch1 == ')' && ch2 != '(') || (ch1 == ']' && ch2 != '[') || (ch1 == '}' && ch2 != '{')){
                            return false;
                  }
        
              }
        }
        if(!stk.isEmpty()) return false;
        return true;
    }
}
