class Solution {
    public int[][] kClosest(int[][] points, int k) {
       PriorityQueue<int[]>pq = new PriorityQueue<>( (a,b) -> {
             int  dista = a[0] * a[0] + a[1] * a[1];
             int  distb =  b[0] * b[0] + b[1] * b[1];

              return Integer.compare(dista,distb);
       });

       for(int point[] : points){
              pq.offer(point);
       }

       int result[][] = new int[k][2];

       for(int i=0;i<k;i++){
             result[i] = pq.poll();
       }
       return result;
    }
}
