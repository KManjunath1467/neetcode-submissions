class Solution {
    List<List<Integer>>result = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        backtrack(nums,target,new ArrayList<>(),0,0);
        return result;
    }

    public void backtrack(int nums[],int target,List<Integer>list,int sum,int k){
                  if(sum == target){
                      if(!result.contains(list)) {
                          result.add(new ArrayList<>(list));
                      }   
                        return;
                  }
                
                if(sum > target){
                      return;
                }
            for(int i=k;i<nums.length;i++){

                if (i > k && nums[i] == nums[i - 1]) {
                continue;
            }

                       list.add(nums[i]);
                       backtrack(nums,target,list,sum+nums[i],i+1);
                       list.remove(list.size()-1);
            }
    }
}
