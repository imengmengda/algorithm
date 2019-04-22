package com.follower.leetcode;

/**
 * Created by lin on 19-4-23.
 */
public class UniquePaths_0062 {

    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        dp[0][1] = dp[1][0] = 1;
        for (int i = 0; i != m; i++) {
            for (int j = 0; j != n; j ++) {
                dp[i][j] = dp[i -1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

}
