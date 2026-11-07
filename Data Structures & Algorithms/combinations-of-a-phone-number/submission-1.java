class Solution {
    List<String>result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
             return result;
        }
       String arr[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
       search(digits,arr,0,new StringBuilder()); 
       return result;
    }

    public void search(String digit,String arr[],int i,StringBuilder sb){
        if(i == digit.length()) {
            result.add(sb.toString());
            return;
        }
         int n = digit.charAt(i)-'0';
         String ar = arr[n];
         for(int k=0;k<ar.length();k++){
                sb.append(ar.charAt(k));
                search(digit,arr,i+1,sb);
                sb.deleteCharAt(sb.length()-1);
         }
    }
}
