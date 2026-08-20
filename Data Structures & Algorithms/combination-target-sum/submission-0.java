class Solution {
    List<List<Integer>>result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
            checksum(nums,new ArrayList<>(),target,0,0);
            return result;
    }

    public void checksum(int nums[],List<Integer>list,int target,int sum,int k){
                          if(sum == target){
                                 result.add(new ArrayList<>(list));
                                 return;
                          }
                        if(sum > target){
                             return;
                        }
                
                for(int i=k;i<nums.length;i++){
                      list.add(nums[i]);
                      checksum(nums,list,target,sum+nums[i],i);
                      list.remove(list.size()-1);
                }
    }
}
