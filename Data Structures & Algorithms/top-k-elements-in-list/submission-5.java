class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
               map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));

        pq.addAll(map.keySet());

        int val[] = new int[k];
        for(int i=0;i<k;i++){
             val[i] = pq.poll();
        }
        return val;
    }
}
