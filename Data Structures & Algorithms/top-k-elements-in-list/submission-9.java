class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int num : nums){
              map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b) ->{
                return map.get(b) - map.get(a);
        });

        for(int n : map.keySet()){
             pq.add(n);
        }
        int arr[] = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = pq.remove();
        }

        return arr;
    }
}
