class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
       char c[] = new char[1024];
       for(int i=0;i<s.length();i++){
        c[s.charAt(i)-'a']++;
        c[t.charAt(i)-'a']--;
       }
       for(char ch:c ){
        if(ch!=0){
            return false;
        }
       }
       return true;
    }
}
