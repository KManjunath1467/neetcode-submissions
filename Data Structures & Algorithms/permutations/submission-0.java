class Solution {
    List<List<Integer>>result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean b[] = new boolean[nums.length];
        backtrack(nums,b,new ArrayList<>());
        return result;
    }

    public void backtrack(int nums[],boolean b[],List<Integer>list){
                   if(list.size() == nums.length){
                          result.add(new ArrayList<>(list));
                          return;
                   }
            for(int i=0;i<nums.length;i++){
                 if(b[i] == true) continue;
                 b[i] = true;
                 list.add(nums[i]);
                 backtrack(nums,b,list);
                 list.remove(list.size()-1);
                 b[i] = false;
            }
    }
}
