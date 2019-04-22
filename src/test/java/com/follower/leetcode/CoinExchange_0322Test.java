package com.follower.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-4-22.
 */
public class CoinExchange_0322Test {

    CoinExchange_0322 solution = new CoinExchange_0322();

    @Test
    public void coinChange() throws Exception {
        int[] coins = {1, 2, 5};
        int amount = 11;
        Assert.assertEquals(3, solution.coinChange(coins, amount));
    }



}