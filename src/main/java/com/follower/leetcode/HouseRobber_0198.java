package com.follower.leetcode;

/**
 * Created by lin on 19-4-27.
 */
public class HouseRobber_0198 {

    public int rob(int[] nums) {
        int[] dp = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i ++) {
            if (i >= 2) {
                dp[i] = Math.max(nums[i - 1] + dp[i - 2], dp[i - 1]);
            } else {
                dp[i] = nums[0];
            }
        }
        return dp[nums.length];
    }
}
