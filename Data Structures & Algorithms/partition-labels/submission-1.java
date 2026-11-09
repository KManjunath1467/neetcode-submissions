class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer>result = new ArrayList<>();
        int arr[] = new int[26];

        for(int i=0;i<s.length();i++){
             arr[s.charAt(i) - 'a'] = i;         
        }

        int j=0,start = 0;
        int end = 0;
        while(j<s.length()){
            end = Math.max(end,arr[s.charAt(j) - 'a']);

            if(j == end){
                 result.add(end-start+1);
                 start = j+1;
            }
         j++; 
        }

        return result;
    }
}
