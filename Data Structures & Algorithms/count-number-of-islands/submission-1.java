class Solution {
    char ch[][];
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int count = 0;
        ch = new char[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                  ch[i][j] = grid[i][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                   if(ch[i][j] == '0' || ch[i][j] == 'X') continue;

                   if(!backtrack(i,j,r,c)){
                       count++;
                   }
            }
        }
        return count;
    }

    public boolean backtrack(int i,int j,int r, int c){
                if(i<0 || j<0 || i>=r || j>= c || ch[i][j] == 'X' || ch[i][j] == '0'){
                      return false;
                }
     ch[i][j] = 'X';
    boolean check = (backtrack(i,j+1,r,c) || backtrack(i+1,j,r,c) || backtrack(i,j-                    1,r,c) || backtrack(i-1,j,r,c));

    return check;         
    }
}
