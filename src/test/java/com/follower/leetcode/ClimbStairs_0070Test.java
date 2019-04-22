package com.follower.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-4-21.
 */
public class ClimbStairs_0070Test {

    ClimbStairs_0070 solution = new ClimbStairs_0070();

    @Test
    public void climbStairs() throws Exception {
        Assert.assertEquals(3, solution.climbStairs(3));
    }

}