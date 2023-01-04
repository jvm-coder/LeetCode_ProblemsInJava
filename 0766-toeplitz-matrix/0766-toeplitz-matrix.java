class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        //checking row-wise
        for(int i=0; i<rows; i++){
            int check = matrix[i][0];
            for(int j=i+1, k=1; k<cols; j++, k++) {
                if(j == rows)    break;
                if(matrix[j][k] != check)   return false;
            }
        }
        
        //checking column-wise
        for(int i=1; i<cols; i++){
            int check = matrix[0][i];
            for(int j=1, k=i+1; j<rows; j++, k++) {
                if(k == cols)    break;
                if(matrix[j][k] != check)   return false;
            }
        }
        
        return true;
    }
}