class Solution {
    public boolean isValidSudoku(char[][] board) {
        //checking rows
        for(int i=0; i<9; i++) {
            HashSet<Character> hs = new HashSet();
            for(int j=0; j<9; j++) {
                if(hs.contains(board[i][j])) {
                    if(board[i][j] != '.')  return false;
                }
                hs.add(board[i][j]);
            }
        }
        
        //checking columns
        for(int i=0; i<9; i++) {
            HashSet<Character> hs = new HashSet();
            for(int j=0; j<9; j++) {
                if(hs.contains(board[j][i])) {
                    if(board[j][i] != '.')  return false;
                }
                hs.add(board[j][i]);
            }
        }
        
        //checking sub-matrices
        for(int i=0; i<7; i+=3) {
            for(int j=0; j<7; j+=3) {
                HashSet<Character> hs = new HashSet();
                for(int p=0; p<3; p++) {
                    for(int q=0; q<3; q++) {
                        int a = i+p;
                        int b = j+q;
                        if(hs.contains(board[a][b])) {
                            if(board[a][b] != '.')  return false;
                        }
                        hs.add(board[a][b]);
                    }
                }
            }
        }
        
        return true;
    }
}