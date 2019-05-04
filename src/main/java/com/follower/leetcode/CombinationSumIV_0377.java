package com.follower.leetcode;

/**
 * Created by lin on 19-5-4.
 */
public class CombinationSumIV_0377 {

    public int combinationSum4(int[] nums, int target) {
        int[]dp = new int[target + 1];
        /**
         * 初始化dp矩阵
         */
        dp[0] = 1;
        for (int i = 1; i <= target; i ++) {
            for (int j = 0; j != nums.length; j ++) {
                if (i >= nums[j]) {
                    dp[i] += dp[i - nums[j]];
                }
            }
        }
        return dp[target];
    }

}
