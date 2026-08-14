class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[] = new int[256];
        for(char ch : s.toCharArray()){
              arr[ch-'A']++;
        }
        for(char ch : t.toCharArray()){
            if(arr[ch - 'A'] == 0){
                return false;
            }
              arr[ch-'A']--;
        }
        for(int num : arr){
             if(num >0){
                 return false;
             }
        }
        return true;

    }
}
