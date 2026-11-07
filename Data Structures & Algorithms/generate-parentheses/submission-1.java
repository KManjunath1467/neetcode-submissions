class Solution {
    List<String>result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        search(new StringBuilder(),n,0,0);
        return result;
    }
    public void search(StringBuilder sb,int n,int open,int close){
                   if(open == n && close == n){
                        result.add(sb.toString());
                        return;
                   }

            if(open < n){
                 sb.append('(');
                 search(sb,n,open+1,close);
                 sb.deleteCharAt(sb.length()-1);
            }
            if(close < open){
                  sb.append(')');
                  search(sb,n,open,close+1);
                  sb.deleteCharAt(sb.length()-1);
            }
    }
}
