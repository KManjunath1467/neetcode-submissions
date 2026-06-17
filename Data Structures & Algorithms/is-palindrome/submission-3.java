class Solution {
    public boolean isPalindrome(String s) {
          int i=0,j = s.length()-1;
          while(i<j){
                 while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                     i++;
                 }
                 while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                     j--;
                 }
                 char ch1 = Character.toLowerCase(s.charAt(i));
                 char ch2 = Character.toLowerCase(s.charAt(j));

                 if(ch1 != ch2) return false;
                 i++;
                 j--; 
          }
          return true;
    }
}
