class Solution {
    public int maxArea(int[] heights) {
        int i=0,j = heights.length-1;
        int Maxarea = 0;
        while(i<j){
            int length = Math.min(heights[i],heights[j]);
            int breadth = j - i;
            int area = length * breadth;
            Maxarea = Math.max(Maxarea,area);
            if(heights[i] < heights[j]){
               i++;
            }else if(heights[i]>heights[j]){
                 j--;
            }else{
                 i++;
                 j--;
            }
        }
        return Maxarea;
    }
}
