class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        StringBuilder sb = new StringBuilder();
        int maxlen = 0;
        while(i<s.length()){
            char ch = s.charAt(i);
            while(sb.toString().contains(String.valueOf(ch))){
                  sb.deleteCharAt(0);
            }
            sb.append(String.valueOf(ch));
            maxlen = Math.max(maxlen,sb.length());
            i++;
        }
        return maxlen;
    }
}
