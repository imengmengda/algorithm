package com.follower.lintcode;

/**
 * Created by lin on 19-5-4.
 */
public class LongestCommonSubstring_0079 {

    public int longestCommonSubstring(String A, String B) {
        int[][] dp = new int[A.length() + 1][B.length() + 1];
        int res = 0;
        for (int i = 1; i <= A.length(); i++) {
            for (int j = 1; j <= B.length(); j++) {
                if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    res = Math.max(res, dp[i][j]);
                }
            }
        }
        return res;
    }
}
