package com.follower.leetcode;

/**
 * Created by lin on 19-7-14.
 */
public class LongestWPI_1024 {

    public int longestWPI(int[] hours) {
        int res = 0;
        int[] dp = new int[hours.length + 1];
        int cnt = 0;
        if (hours.length == 0) {
            return res;
        }
        for (int i = 0; i < hours.length; i ++) {
            if (hours[i] <= 8) {
                dp[i + 1] = dp[i] - 1;
            } else {
                dp[i + 1] = dp[i] + 1;
            }
            res = Math.max(res, cnt);
        }
        return res;
    }

    public static void main(String[] args) {
        LongestWPI_1024 solution = new LongestWPI_1024();
        System.out.println(solution.longestWPI(new int[]{0, 0, 0, 0, 9, 9, 9, 56, 1}));
    }
}
