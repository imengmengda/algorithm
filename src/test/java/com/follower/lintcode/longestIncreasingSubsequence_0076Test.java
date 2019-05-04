package com.follower.lintcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-5-4.
 */
public class longestIncreasingSubsequence_0076Test {

    LongestIncreasingSubsequence_0076 solution = new LongestIncreasingSubsequence_0076();

    @Test
    public void longestIncreasingSubsequence1() throws Exception {
        Assert.assertEquals(10,
                solution.longestIncreasingSubsequence(new int[]{88,4,24,82,86,1,56,74,71,9,8,18,26,53,77,87,60,27,69,17,76,23,67,14,98,13,10,83,20,43,39,29,92,31,0,30,90,70,37,59}));
    }

    @Test
    public void longestIncreasingSubsequence2() throws Exception {
        Assert.assertEquals(2, solution.longestIncreasingSubsequence(new int[]{1, 2}));
    }

}