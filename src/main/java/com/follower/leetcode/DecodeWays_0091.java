package com.follower.leetcode;

/**
 * Created by lin on 19-5-4.
 */
public class DecodeWays_0091 {

    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = (s.charAt(0) == '0'? 0 : 1);
        for (int i = 2; i <= s.length(); i ++) {
            int last2Num = Integer.parseInt(s.substring(i - 2, i));
            int lastNum = Integer.parseInt(s.substring(i - 1, i));
            if ((last2Num >= 1) && (last2Num <= 26) && s.charAt(i - 2) != '0') {
                dp[i] += dp[i - 2];
            } if (lastNum != 0) {
                dp[i] += dp[i - 1];
            }
        }
        return dp[s.length()];
    }
}
