package com.follower.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-4-22.
 */
public class MaximumSubarray_0053Test {

    MaximumSubarray_0053 solution = new MaximumSubarray_0053();

    @Test
    public void maxSubArray() throws Exception {
        Assert.assertEquals(6, solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

}