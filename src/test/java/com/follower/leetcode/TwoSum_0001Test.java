package com.follower.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lin on 19-4-21.
 */
public class TwoSum_0001Test {

    TwoSum_0001 solution = new TwoSum_0001();

    @Test
    public void twoSum() throws Exception {
        int[] nums = {2, 7, 11, 15};
        Assert.assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, 9));
    }

}