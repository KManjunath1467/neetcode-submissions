class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
         int n = position.length;

         int race[][] = new int[n][2];

         for(int i=0;i<n;i++){
               race[i][0] = position[i];
               race[i][1] = speed[i];
         }

         Stack<Double>stk = new Stack<>();
         Arrays.sort(race,(a,b) -> b[0] - a[0]);
         for(int nums[] : race){
                int pos = nums[0];
                int sped = nums[1];

                double time = (double) (target - pos)/sped;
            if(stk.isEmpty()  ||  time > stk.peek()){
                    stk.push(time);
            }
         }
          return stk.size();
    }
}
