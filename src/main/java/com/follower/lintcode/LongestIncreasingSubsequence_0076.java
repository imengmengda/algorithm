package com.follower.lintcode;

/**
 * Created by lin on 19-5-4.
 */
public class LongestIncreasingSubsequence_0076 {

    public int longestIncreasingSubsequence(int[] nums) {
        // write your code here
        int[] dp = new int[nums.length + 1];
        for (int i = 0; i <= nums.length; i ++) {
            dp[i] = 1;
        }
        int res = 0;
        for (int i = 1; i <= nums.length; i ++) {
            for (int j = 1; j < i; j++) {
                if (nums[i - 1] > nums[j - 1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }

}
