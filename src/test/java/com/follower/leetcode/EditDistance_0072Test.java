package com.follower.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-4-23.
 */
public class EditDistance_0072Test {

    EditDistance_0072 solution = new EditDistance_0072();

    @Test
    public void minDistance() throws Exception {
        Assert.assertEquals(3, solution.minDistance("horse", "ros"));
    }

}