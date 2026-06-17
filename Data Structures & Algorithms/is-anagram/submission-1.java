class Solution {
    public boolean isAnagram(String s, String t) {
             if(s.length() != t.length()) return false;

             int eq[] = new int[256];

             for(char ch : s.toCharArray()){
                   eq[ch - 'a']++;
             }
             for(char ch : t.toCharArray()){
                   eq[ch - 'a']--;
             }
             for(int num : eq){
                   if(num>0){
                      return false;
                   }
             }
             return true;
    }
}
