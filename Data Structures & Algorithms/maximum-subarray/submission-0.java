class Solution {
    public int maxSubArray(int[] nums) {
        int i=0,j=0;
        int sum=0,max=Integer.MIN_VALUE;
        while(j<nums.length){
               sum+=nums[j];
                max = Math.max(max,sum);
               while(sum<0){
                  sum-=nums[i];
                  i++;
               }  
               j++;
        }
        return max;
    }
}
