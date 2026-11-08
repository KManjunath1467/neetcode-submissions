class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean a = false;
        boolean b = false;
        boolean c = false;

        for(int t[] : triplets){

             if(t[0] > target[0] || t[1] > target[1] || t[2] >  target[2]){
                 continue;
             }

             if(target[0] == t[0]) a = true;
             if(target[1] == t[1]) b = true;
             if(target[2] == t[2]) c = true;
        } 
        return a&&b&&c;
    }
}
