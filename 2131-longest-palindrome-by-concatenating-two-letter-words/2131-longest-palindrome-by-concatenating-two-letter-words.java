class Solution {
    public int longestPalindrome(String[] words) {
        int[][] dp = new int[26][26];
        int midLen = 0;
        int restLen = 0;
        
        for(String word : words)
            ++dp[word.charAt(0)-'a'][word.charAt(1)-'a'];
        
        
        for(int i=0; i<26; i++) {
            for(int j=0; j<26; j++) {
                if(i != j) {    //case of 'lc'
                    if(dp[i][j]>0 && dp[j][i]>0) {  //case of 'lc' and 'cl'
                        restLen += Math.min(dp[i][j], dp[j][i]) * 4; //prepend and append should be done same number of times, so min of 'lc' and 'cl' will be taken
                        dp[i][j] = 0;
                        dp[j][i] = 0;
                    }
                }
                else {  //case of gg
                    if(dp[i][j]%2 == 0) // if even, half-half will be added to start and end
                        restLen += dp[i][j] * 2;
                    else { // if odd, one will be added in mid, and half-half to start and end
                        midLen = 2;
                        restLen += 2*(dp[i][j] - 1);
                    }
                }
            }
        }
        return midLen+restLen;
    }
}