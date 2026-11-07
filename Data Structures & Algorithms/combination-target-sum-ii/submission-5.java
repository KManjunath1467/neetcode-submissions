class Solution {
    List<List<Integer>>result = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer>list = new ArrayList<>();
        Arrays.sort(candidates);
        search(0,candidates,target,list,0);
        return result;
    }

    public void search(int i,int nums[],int tar,List<Integer>list,int sum){
                if(sum == tar){
                         if(!result.contains(list)){
                                 result.add(new ArrayList<>(list));
                         }
                         return;
                }
            if(sum > tar || i>=nums.length) return;

            for(int k=i;k<nums.length;k++){
                    if(k > i && nums[k] == nums[k-1]) continue;
                     list.add(nums[k]);
                     search(k+1,nums,tar,list,sum+nums[k]);

                     list.remove(list.size()-1);
            }
    }
}
