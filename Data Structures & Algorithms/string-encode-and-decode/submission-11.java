class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String arr : strs){
         sb.append(String.valueOf(arr.length()));
         sb.append("#");
         sb.append("$");
         sb.append(arr);
        }
      return sb.toString();
    }

    public List<String> decode(String str) {
        int i=0;
        List<String>result = new ArrayList<>();
        while(i < str.length()){
           int n=0;
           while(i<str.length() && str.charAt(i) != '#'){
              n = n*10 + str.charAt(i) - '0';
              i++;
           }
           i+=2;
           result.add(str.substring(i,i+n));
           i = i+n;
        }
        return result;
    }
}
