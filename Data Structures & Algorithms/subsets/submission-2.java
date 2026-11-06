class Solution {
    List<List<Integer>>result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>list = new ArrayList<>();
        checksets(0,nums,list);
        return result;
    }

    public void checksets(int k,int nums[],List<Integer>list){
           result.add(new ArrayList<>(list));

           if(k>=nums.length) return;


           for(int i=k;i<nums.length;i++){
                 list.add(nums[i]);
                 checksets(i+1,nums,list);
                 list.remove(list.size()-1);
           }
    }
}
