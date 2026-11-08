class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]>result = new ArrayList<>();
        
        int n = intervals.length;
        int i=1;
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        int temp[] = new int[2];
        temp[0] = intervals[0][0];
        temp[1] = intervals[0][1];

        while(i<n){
            

            if(intervals[i][0] <= temp[1]){
                 temp[0] = Math.min(temp[0],intervals[i][0]);
                 temp[1] = Math.max(temp[1],intervals[i][1]);
            }else{
                result.add(temp);
                 temp = new int[2];
                temp[0] = intervals[i][0];
                temp[1] = intervals[i][1];

            }
            i++;
        }
        result.add(temp);

        return result.toArray(new int[result.size()][]);
    }
}
