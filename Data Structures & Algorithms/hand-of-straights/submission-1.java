class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int num : hand){
             map.put(num,map.getOrDefault(num,0)+1);
        }
        Arrays.sort(hand);

        for(int n : hand){
             if(map.get(n) == 0){
                 continue;
             }
             int ele = n;
             for(int i=0;i<groupSize;i++){
                   if(map.getOrDefault(ele,0) == 0) return false;

                   map.put(ele,map.getOrDefault(ele,0)-1);
                   ele+=1;
             }
        }
        return true;
    }
}
