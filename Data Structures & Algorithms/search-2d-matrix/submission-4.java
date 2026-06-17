class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int minind = 0;
        for(int i=matrix.length-1;i>=0;i--){
           if(matrix[i][0] <= target){
                minind = i;
                break;
           }
        }
        for(int i=0;i<matrix[0].length;i++){
             if(matrix[minind][i] == target) return true;
        }
        return false;
    }
}
