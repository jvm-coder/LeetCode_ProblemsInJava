class Solution {
<<<<<<< HEAD
    public int helper(int n, int[] dp) {
        for(int i=0; i<=n; i++) {
            if(i == 0 || i == 1)    dp[i] = 1;
            else    dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        return helper(n, dp);
=======
    public int climbStairs(int n) {
        int[]  dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i=2; i<=n; i++)
            dp[i] = dp[i-1] + dp[i-2];
        
        return dp[n];
>>>>>>> 95776b3289938736b4fd6cda3625f47591f8b4b6
    }
}