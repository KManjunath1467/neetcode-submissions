class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
             int complement = target-numbers[i];
             if(map.containsKey(complement)){
                int ind = map.get(complement);
                return new int[]{ind+1,i+1};
             }
             map.put(numbers[i],i);
        }
        return new int[]{-1,-1};
    }
}
