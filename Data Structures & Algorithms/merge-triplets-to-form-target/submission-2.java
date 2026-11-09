class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean a = false;
        boolean b = false;
        boolean c = false;

        for(int trip[] : triplets){
               if(trip[0] > target[0] || trip[1] > target[1] || trip[2] >target[2]){
                 continue;
               }

               if(trip[0] == target[0]) a = true;
               if(trip[1] == target[1]) b = true;
               if(trip[2] == target[2]) c = true;
        }

        return a&&b&&c;
    }
}
