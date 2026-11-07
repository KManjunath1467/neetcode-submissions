class Solution {
    public int jump(int[] nums) {
        int i=0;
        int count=0;
        while(i<nums.length-1){
             int jump = nums[i];
             int max=0,ind=-1;

             if((i+jump) >= nums.length-1){
                count+=1;
                break;
             }

             for(int j=i+1;j<=i+jump;j++){
                int reach = j+nums[j];
                if(reach > max){
                     max = reach;
                     ind = j;
                }
             }
             if(ind == -1 || max == 0){
                  break;
             }
             i = ind;
             count+=1;
        }
        return count;
    }
}
