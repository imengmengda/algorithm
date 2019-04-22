package com.follower.leetcode;

/**
 * Created by lin on 19-4-22.
 */
public class CoinExchange_0322 {

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 1; i != amount + 1; i++) {
            dp[i] = amount + 1;
        }
        dp[0] = 0;
        for (int i = 0; i != coins.length; i++) {
            for (int j = coins[i]; j <= amount; ++j) {
                dp[j] = Math.min(dp[j], dp[j- coins[i]] + 1);
            }
        }
        return dp[amount] <= amount? dp[amount]: -1;
    }

}
