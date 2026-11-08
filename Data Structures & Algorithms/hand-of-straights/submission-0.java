class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int n : hand){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        Arrays.sort(hand);
        for(int n : hand){
             if(map.get(n) == 0){
                     continue;
             }
             for(int j=0;j<groupSize;j++){
                  int ele = n+j;
                  if(map.getOrDefault(ele,0) == 0){
                        return false;
                  }

                  map.put(ele,map.getOrDefault(ele,0)-1);
             }
        }
        return true;
    }
}
