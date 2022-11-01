class Solution {
    public int getMaximumGenerated(int n) {
        int[] dp = new int[n+1];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<=n; i++) {
            if(i==0 || i==1)    dp[i] = i;
            else {
                if(i%2 == 0)    dp[i] = dp[i/2];
                else    dp[i] = dp[i/2]+dp[(i/2)+1];
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}