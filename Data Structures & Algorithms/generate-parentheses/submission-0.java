class Solution {
    List<String>result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        backtrack(new StringBuilder(),n,0,0);
        return result;
    }

    public void backtrack(StringBuilder sb,int n,int open,int close){
             if(close == n && open == n){
                      result.add(sb.toString());
                      return;
             }
        if(open < n){
              sb.append('(');

              backtrack(sb,n,open+1,close);

              sb.deleteCharAt(sb.length()-1);
        }
        if(close < open){
             sb.append(')');

             backtrack(sb,n,open,close+1);

             sb.deleteCharAt(sb.length()-1);
        }
    }
}
