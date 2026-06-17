class Solution {
    public int maxProfit(int[] prices) {
           int maxprofit = 0;
           int stock = Integer.MAX_VALUE;
           for(int num : prices){
                if(num < stock){
                     stock = num;
                }else{
                    int profit = num - stock;
                    maxprofit = Math.max(maxprofit,profit);
                }
           }
     
       return maxprofit;
    }
}
