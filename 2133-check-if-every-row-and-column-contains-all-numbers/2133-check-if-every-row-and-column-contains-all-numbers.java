class Solution {
    public boolean checkValid(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        
        //checking rows
        for(int i=0; i<rows; i++) {
            HashSet<Integer> hs = new HashSet<>();
            for(int j=0; j<cols; j++) {
                if(hs.contains(board[i][j])) {
                    if(board[i][j] != 0)  return false;
                }
                hs.add(board[i][j]);
            }
        }
        
        //checking columns
        for(int i=0; i<rows; i++) {
            HashSet<Integer> hs = new HashSet<>();
            for(int j=0; j<cols; j++) {
                if(hs.contains(board[j][i])) {
                    if(board[j][i] != 0)  return false;
                }
                hs.add(board[j][i]);
            }
        }
        return true;
    }
}