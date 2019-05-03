package com.follower.lintcode;

/**
 * Created by lin on 19-5-3.
 */
public class BackPack_0092 {

    public int backPack(int m, int[] A) {
        // write your code here
        int[][] dp = new int[A.length + 1][m + 1];
        for (int i = 1; i <= A.length; i ++) {
            for (int j = m; j >= 0; j--) {
                if (j < A[i - 1]) {
                    dp[i][j]= dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(
                            dp[i - 1][j],
                            dp[i - 1][j - A[i - 1]] + A[i - 1]
                    );
                }
            }
        }
        return dp[A.length][m];
    }
}
