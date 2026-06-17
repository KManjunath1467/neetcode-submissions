class Solution {
    public boolean checkInclusion(String s1, String s2) {
          char ch1[] = new char[26];
          char ch2[] = new char[26];

          for(int i=0;i<s1.length();i++){
                 ch1[s1.charAt(i) - 'a']++;
          }
          int j=0;
          for(int i=0;i<s2.length();i++){
                if(i>=s1.length()){
                       if(ispresent(ch1,ch2)) return true;
                       ch2[s2.charAt(j++) - 'a']--;
                }
                ch2[s2.charAt(i) - 'a']++;
          }
          if(ispresent(ch1,ch2)) return true;
          return false;
    }

    public boolean ispresent(char ch1[] ,char ch2[]){
              int k =0;
              while(k<26){
                  if(ch1[k] != ch2[k]) return false;
                  k++;
              }
              return true;
    }
}
