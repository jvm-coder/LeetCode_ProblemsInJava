class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];
        for (int j = 0; j < n; ++j) {
            dp[0][j] = matrix[0][j];
        }
        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                // dp[i][j] = min({dp[i - 1][j], dp[i - 1][j - 1], dp[i - 1][j + 1]})
                dp[i][j] = dp[i - 1][j];
                if (j - 1 >= 0) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1]);
                }
                if (j + 1 < n) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j + 1]);
                }
                dp[i][j] += matrix[i][j];
            }
        }
        int result = n * 100;
        for (int j = 0; j < n; ++j) {
            result = Math.min(result, dp[n - 1][j]);
        }
        return result;
    }
}