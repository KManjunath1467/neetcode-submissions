class Solution {
    int ch[][];
    int count = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int max = 0;
        ch = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                  ch[i][j] = grid[i][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                   if(ch[i][j] == 0 || ch[i][j] == -1) continue;
                    count  = 0;
                   if(!backtrack(i,j,r,c)){
                       max = Math.max(max,count);
                   }
            }
        }
        return max;
}

    public boolean backtrack(int i,int j,int r, int c){
                if(i<0 || j<0 || i>=r || j>= c || ch[i][j] == -1 || ch[i][j] == 0){
                      return false;
                }
     ch[i][j] = -1;
     count++;
    boolean check = (backtrack(i,j+1,r,c) || backtrack(i+1,j,r,c) || backtrack(i,j-                    1,r,c) || backtrack(i-1,j,r,c));

    return check;         
    }
}
