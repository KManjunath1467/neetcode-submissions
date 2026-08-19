class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones){
             pq.add(stone);
        }
        while(pq.size()>1){
              int st1 = pq.poll();
              int st2 = pq.poll();

              int rem = st1 - st2;
              if(rem <0){
                 rem*=-1;
              }
              pq.add(rem);
        }

        return pq.poll();

    }
}
