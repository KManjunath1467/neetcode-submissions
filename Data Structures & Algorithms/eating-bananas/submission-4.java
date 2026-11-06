class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int max = 0;
       for(int i=0;i<piles.length;i++){
            max = Math.max(max,piles[i]);
       }
       int maxrate =0; 
       int left=1,right = max;
       while(left<=right){
               int mid = left + (right - left)/2;
               long count = 0;

for (int i = 0; i < piles.length; i++) {
    count += ((long)piles[i] + mid - 1) / mid;
}
               if(count <= h){
                    maxrate = mid;
                    right = mid-1;
               }else{
                    left = mid+1;
               }
       }
       return maxrate;
    }
}
