class Solution {
    public int maxArea(int[] heights) {
        int i=0,j=heights.length-1;
        int max = 0;
        while(i<j){
            int len = Math.min(heights[i],heights[j]);
           int  bred = j-i;
            
            max = Math.max(max,len*bred);
            if(heights[i] < heights[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}
