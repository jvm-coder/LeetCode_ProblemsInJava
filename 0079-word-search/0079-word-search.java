class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        
        return false;
    }

    private static boolean dfs (char[][] board, String word, int row, int col, int index) {
        if (index == word.length()) {
            return true;
        }
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || 
                board[row][col] != word.charAt(index) || board[row][col] == '#') {
            return false;
        }

        board[row][col] = '#';

        boolean res = dfs(board, word, row + 1, col, index + 1) ||
                      dfs(board, word, row - 1, col, index + 1) ||
                      dfs(board, word, row, col + 1, index + 1) ||
                      dfs(board, word, row, col - 1, index + 1);

        board[row][col] = word.charAt(index);

        return res;
    }
}