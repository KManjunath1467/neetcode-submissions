class Solution {
    public boolean canJump(int[] nums) {
        int i=0;
        while(i<nums.length-1){
           int jump  = nums[i];

           int j = i+1;
           int ind = -1;
           int max = 0;
           if((i+jump) >= nums.length-1) return true;
           while(j<=(i+jump)){
                  int temp = j + nums[j];
                  if(temp > max){
                     max = temp;
                     ind = j;
                  }
                  j++;
           }
           if(max == 0 || ind == -1) return false;
           i = ind;
        }

        return true;
    }
}
