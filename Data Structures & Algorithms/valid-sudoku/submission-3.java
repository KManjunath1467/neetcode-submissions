class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row[][] = new int[10][10];
        int col[][] = new int[10][10];
        int box[][] = new int[10][10];

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] == '.') continue;
                int ele = board[i][j] - '0';
                int b = (i/3) * 3 + (j/3);
                if(row[i][ele] == 1 || col[ele][j] == 1 || box[b][ele] == 1){
                     return false;
                }
                row[i][ele] = 1;
                col[ele][j] = 1;
                box[b][ele] = 1;
            }
        }
        return true;
    }
}
