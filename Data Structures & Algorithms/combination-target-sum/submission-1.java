class Solution {
    List<List<Integer>>result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer>list = new ArrayList<>();
        search(0,target,list,nums,0);
        return result;
    }
    public void search(int i,int tar,List<Integer>list,int nums[],int sum){
                if(sum == tar){
                     result.add(new ArrayList<>(list));
                     return;
                }
                if(sum>tar || i>= nums.length)return ;

                for(int k=i;k<nums.length;k++){
                    list.add(nums[k]);
                      search(k,tar,list,nums,sum+nums[k]);
                      list.remove(list.size()-1);
                }
    }
}
