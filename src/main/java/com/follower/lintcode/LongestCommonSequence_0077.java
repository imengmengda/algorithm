package com.follower.lintcode;

/**
 * Created by lin on 19-5-4.
 */
public class LongestCommonSequence_0077 {

    public int longestCommonSubsequence(String A, String B) {
        int[][] dp = new int[A.length() + 1][B.length() + 1];
        for (int i = 1; i <= A.length(); i ++) {
            for (int j = 1; j <= B.length(); j++) {
                if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[A.length()][B.length()];
    }

}
