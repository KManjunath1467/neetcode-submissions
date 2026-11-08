class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[1],b[1]));
        int count = 0;
        int end = intervals[0][1];
        int i = 1;
        while(i<intervals.length){

            if(intervals[i][0] < end){
                   count++;
            }else{
                  end = intervals[i][1];
            }
            i++;
        }
        return count;
    }
}
