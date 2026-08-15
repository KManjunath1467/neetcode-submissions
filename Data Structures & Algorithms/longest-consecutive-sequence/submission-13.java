class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int num : nums){
              pq.add(num);
        }
        int temp = pq.poll();
        int n = pq.size();
        int count = 1;
        int max = 1;
        for(int i = 0;i<n;i++){
             int num = pq.poll();
             if(temp == num) continue;
             if(((temp +1) == num)){
                 count++;
             }else{
                 count = 1;
             }
             temp = num;
            max = Math.max(max,count);
        }
     return max;
    }
}
