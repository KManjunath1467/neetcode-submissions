class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num: piles){
             max = Math.max(max,num);
        }
        int left = 1;
        int right = max;
        while(left <= right){
            int mid = left + (right - left)/2;
             int hours = 0;
             for(int num : piles){
                 hours+= (num+mid-1)/mid;
             }
             if(hours <= h ){
                 min = Math.min(min,mid);
                 right = mid-1;
             }else{
                  left = mid+1;
             }
        }
        return min;
    }
}
