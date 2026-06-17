class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int result[] = new int[n];
        for(int i=n-1;i>=0;i--){
               int val = temperatures[i];
               int k=1;
               int has = -1;
               for(int j = i+1;j<n;j++){
                       if(temperatures[j] > val){
                           has = 1;
                           break;
                       } 
                       k++;
               }
               if(has == -1){
                     result[i] = 0;
               }else{
                     result[i] = k;
               }
        }
        return result;
    }
}
