class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int area=0;
        int left=0,right=n-1;
        while(left<right){
            int height = Math.min(heights[left],heights[right]);
            int width = right-left;
             area = Math.max(area,width*height);
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return area;
    }
}
