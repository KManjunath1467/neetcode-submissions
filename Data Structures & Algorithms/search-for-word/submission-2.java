class Solution {
    public boolean exist(char[][] board, String word) {
        int r = board.length;
        int c = board[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(search(board,word,0,i,j)){
                     return true;
                }
            }
        }
        return false;
    }

    public boolean search(char bor[][],String wor,int k,int i,int j){
        if(k==wor.length()) return true;
         if(i >= bor.length || i<0 || j>= bor[0].length || j<0 || wor.charAt(k) !=   bor[i][j]){
             return false;
         }
          char temp = bor[i][j];
          bor[i][j] = '#';
         boolean way = (search(bor,wor,k+1,i+1,j) || search(bor,wor,k+1,i-1,j)|| search(bor,wor,k+1,i,j+1) || search(bor,wor,k+1,i,j-1));
         bor[i][j] = temp;
         return way;
    }
}
