class Solution {
    public int[] findBall(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        if(cols == 1)   return new int[]{-1};
        int[] output = new int[cols];
        
        for(int k=0; k<cols; k++) {
            int i=0, j=k;
            boolean check = true;
            
            while(i != rows) {
                if(grid[i][j] == 1) {
                    if((j != (cols-1)) && (grid[i][j+1] == -1)) {
                        check = false;
                        break;
                    }
                    ++j;
                }
                else if(grid[i][j] == -1) {
                    
                    if((j != 0) && (grid[i][j-1] == 1)) {
                        check = false;
                        break;
                    }
                    --j;
                }
                ++i;
                if(j<0 || j>=cols) {
                    check = false;
                    break;
                }
            }
            output[k] = check ? j : -1;
        }
        
        return output;
    }
}