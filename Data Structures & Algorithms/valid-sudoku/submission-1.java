class Solution {
    public boolean isValidSudoku(char[][] board) {
        int r = board.length;
        int c = board[0].length;

        int rows[][] = new int[9][10];
        int cols[][] = new int[9][10];
        int boxes[][] = new int[9][10];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j] == '.') continue;
                int ind = (i/3)*3 + (j/3);
                int num = board[i][j] - '0';
                if(rows[i][num] > 0 || cols[j][num] > 0 || boxes[ind][num] > 0){
                          return false;
                }
               rows[i][num]++;
               cols[j][num]++;
               boxes[ind][num]++;
            }
        }
        return true;
    }
}
