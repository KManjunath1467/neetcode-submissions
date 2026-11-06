class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double dists[][] = new double[speed.length][2];
        for(int i=0;i<speed.length;i++){
            dists[i][0] = position[i];
            dists[i][1] = (double)(target - position[i])/speed[i];
        }
        Arrays.sort(dists,(a,b) -> Double.compare(b[0],a[0]));
        int count=0;
        double min = 0;
        for(int i = 0;i<position.length;i++){
               if(dists[i][1]> min){
                     count++;
                     min = dists[i][1];
               }
        }
        return count;
    }
}
