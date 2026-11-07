class Solution {
    public boolean canJump(int[] nums) {
        int i=0;
        while(i<nums.length-1){
            int jump = nums[i];
            int max=0,ind=-1;
            if((i+jump) >= nums.length-1){
                 return true;
            }
            for(int j=i+1;j<=i+jump;j++){
                int reach = j + nums[j];
                  if(reach > max){
                     max = reach;
                     ind = j;
                  }
            }
            if(ind == -1 || max == 0) return false;
            i = ind;
        }
        return true;
    }
}
