class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int []> q = new LinkedList<>();
        int fresh = 0;
        int r = grid.length;
        int c = grid[0].length;
        int min = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                   if(grid[i][j] == 2){
                         q.offer(new int[]{i,j});
                   }
                   if(grid[i][j] == 1){
                        fresh++;
                   }
            }
        }
       int directions[][] ={{0,1},{1,0},{-1,0},{0,-1}};
       while(!q.isEmpty() && fresh >0){
                int size = q.size();
                for(int i=0;i<size;i++){
                     int curr[] = q.poll();

                     int row = curr[0];
                     int col = curr[1];

                     for(int dir[] : directions){
                          int newr = row + dir[0];
                          int cols = col + dir[1];

                          if(newr<0 || cols <0 || newr >=r || cols >= c){
                                 continue;
                          }

                          if(grid[newr][cols] == 1){
                                 grid[newr][cols] = 2;
                                 fresh--;
                                 q.offer(new int[]{newr,cols});
                          }
                     }
                }
            min++;
       }
       if(fresh > 0){
          return -1;
       }
       return min;
    }
}
