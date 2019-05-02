package com.follower.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-4-27.
 */
public class TrappingRainWater_0042Test {

    TrappingRainWater_0042 solution = new TrappingRainWater_0042();

    @Test
    public void trap() throws Exception {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        Assert.assertEquals(6, solution.trap(height));
    }

}