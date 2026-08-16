class Solution {
    public int characterReplacement(String s, int k) {
       int maxfreq = 0;
       int maxlen = 0;
       int freqs[] = new int[26];
       int left = 0;
       for(int right =0 ; right <s.length();right++){
                freqs[s.charAt(right) - 'A']++;
                maxfreq = Math.max(maxfreq,freqs[s.charAt(right)- 'A']);
                int len = right - left + 1;
                int repl = len - maxfreq;
                if(repl > k){
                    freqs[s.charAt(left) - 'A']--;
                    left++;
                }
            maxlen = Math.max(maxlen,right-left+1);
       }
       return maxlen;
    }
}
