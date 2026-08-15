class Solution {
    public int characterReplacement(String s, int k) {
        int maxfreq = 0;
        int l = 0;
        int max = 0;
        int freq[] = new int[26];
        for(int r = 0;r<s.length();r++){
                freq[s.charAt(r) - 'A']++;
                maxfreq = Math.max(maxfreq,freq[s.charAt(r) - 'A']);

                int len = r - l +1;
                int rep = len - maxfreq;

                if(rep > k){
                     freq[s.charAt(l) - 'A']--;
                     l++;
                }
            max = Math.max(max, r - l +1);
        }
        return max;
    }
}
