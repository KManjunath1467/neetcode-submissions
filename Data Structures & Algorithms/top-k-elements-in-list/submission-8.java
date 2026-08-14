class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer>map = new HashMap<>();
       List<Integer>list = new ArrayList<>();
       for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
       }
       PriorityQueue<Integer>pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
       for(int num : map.keySet()){
             pq.add(num);
       }
       int arr[] = new int[k];
       for(int i=0;i<arr.length;i++){
           arr[i] = pq.poll();
       }
       return arr;
    }
}
