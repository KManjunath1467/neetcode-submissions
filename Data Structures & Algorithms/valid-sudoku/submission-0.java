class Solution {
    public boolean isValidSudoku(char[][] board) {
        int rows[][] = new int[9][9];
        int columns[][] = new int[9][9];
        int boxes[][] = new int[9][9];
        for(int i=0;i<9;i++){
          for(int j=0;j<9;j++){
                if(board[i][j] == '.')continue;
                int num = board[i][j] - '0';
                int boxind =  (i / 3) * 3 + (j / 3);
                if(rows[i][num-1] == 1 || columns[j][num-1] == 1 || boxes[boxind][num-1] == 1) return false;
                rows[i][num-1] = 1;
                columns[j][num-1] = 1;
                boxes[boxind][num-1] = 1;
          }
        }
        return true;
    }
}
