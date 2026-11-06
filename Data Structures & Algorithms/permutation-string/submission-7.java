class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int str1[] = new int[26];
        int str2[] = new int[26];
        for(int k=0;k<s1.length();k++){
            str1[s1.charAt(k) - 'a']++;
        }
        int i=0,j=0;
        while(j<s2.length()){
              if(j>=s1.length()){
                  str2[s2.charAt(i) - 'a']--;
                  i++;  
              }
              str2[s2.charAt(j) - 'a']++;

              int k=0;
        while(k<s1.length() && str1[s1.charAt(k)-'a'] == str2[s1.charAt(k)-'a']){
                k++;
              }
              if(k == s1.length()) return true;
              j++;
        }
        return false;
    }
}
