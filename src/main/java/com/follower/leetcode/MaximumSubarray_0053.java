package com.follower.leetcode;

import java.util.Arrays;

/**
 * Created by lin on 19-4-22.
 */
public class MaximumSubarray_0053 {

    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        for (int i = 1; i != nums.length + 1; i ++) {
            dp[i] = Integer.MIN_VALUE;
        }
        int res = Integer.MIN_VALUE;

        for (int i = 0; i != nums.length; i ++) {
            dp[i + 1] = nums[i] + (dp[i] > 0? dp[i]:0);
            res = Math.max(dp[i + 1], res);
        }

        return res;
    }

}
