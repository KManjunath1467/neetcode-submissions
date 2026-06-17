class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int left = 1;
         int right = 0;
         for(int num : piles){
            right = Math.max(right,num);
         }
         int ans = right;
         while(left <= right){
             int mid = left + (right - left)/2;
             int r = spedcheck(piles,mid);
             if(r <= h){
                 ans = mid;
                 right = mid-1;
             }else{
                 left = mid +1; 
             }
         }
         return ans;
    }

    public int spedcheck(int nums[] , int k){
            int total = 0;
            for(int num : nums){
                total += (num +k -1)/k;
            }
        return total;
    }
}
