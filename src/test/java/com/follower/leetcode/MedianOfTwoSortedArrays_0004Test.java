package com.follower.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-5-16.
 */
public class MedianOfTwoSortedArrays_0004Test {
    MedianOfTwoSortedArrays_0004 solution = new MedianOfTwoSortedArraysBySort_0004();

    @Test
    public void findMedianSortedArraysTest1() throws Exception {
        Assert.assertEquals(3.5, solution.findMedianSortedArrays(new int[]{4}, new int[]{1,2,3,5,6}), 0.1);
    }

    @Test
    public void findMedianSortedArraysTest2() throws Exception {
        Assert.assertEquals(solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 2, 0.1);
    }

}