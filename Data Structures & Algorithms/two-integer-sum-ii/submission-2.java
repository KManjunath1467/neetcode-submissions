class Solution {
    public int[] twoSum(int[] numbers, int target) {
          HashMap<Integer,Integer>map = new HashMap<>();
          int i=0;
          for(int num : numbers){
                 int complement = target - num;
                 if(map.containsKey(complement)){
                      return new int[]{map.get(complement)+1, i+1};
                 }
               map.put(num,i);
               i++;  
          }
          return new int[]{-1,-1};
    }
}
