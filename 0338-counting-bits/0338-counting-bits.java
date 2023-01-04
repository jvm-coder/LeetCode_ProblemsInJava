class Solution {    
    public int[] countBits(int n) {
        int[] dp = new int[n+1];
        
        for(int i=0;i<=n;i++) {
            if(i == 0 || i == 1)    dp[i] = i;

            if(i%2 == 0)    dp[i] = dp[i/2];
            else    dp[i] = 1+dp[i/2];
        }        
        return dp;
    }
}