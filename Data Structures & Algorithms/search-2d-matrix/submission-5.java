class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int row = matrix.length;
         int col = matrix[0].length;

         int i = row-1;
         while(i>=0){
                 if(matrix[i][0] <= target) break;
                 i--;
         }
         if(i<0) return false;
         for(int j=0;j<col;j++){
              if(matrix[i][j] == target) return true;
         }
         return  false;
    }
}
