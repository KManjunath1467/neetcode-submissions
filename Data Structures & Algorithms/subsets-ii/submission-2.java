class Solution {
    List<List<Integer>>result = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
          Arrays.sort(nums);
          backtrack(nums,new ArrayList<>(),0);
          return result;
    }

    public void backtrack(int nums[],List<Integer>list,int k){
      if(!result.contains(list)){
         result.add(new ArrayList<>(list));
      }

               if(k >= nums.length){
                    return;
               } 


          for(int i=k;i<nums.length;i++){
            if(i>k && nums[i] == nums[i-1]){
                 continue;
            }
               list.add(nums[i]);
              backtrack(nums,list,i+1);
              list.remove(list.size()-1);
          }
    }
}
