class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int st1s[] = new int[256];
        for(int i=0;i<s1.length();i++){
               st1s[s1.charAt(i) - 'a']++;
        }
        int j=0;
        int st2s[] = new int[256];
        int i=0;
         while (j < s2.length()) {

            st2s[s2.charAt(j) - 'a']++;
            j++;

            if (j - i > s1.length()) {
                st2s[s2.charAt(i) - 'a']--;
                i++;
            }

            if (j - i == s1.length()) {
                if (Arrays.equals(st1s, st2s)) {
                    return true;
                }
            }

    }
      return false;
   }
}
