package com.follower.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lin on 19-4-21.
 */
public class LongestSubStringLength_0003Test {

    LongestSubStringLength_0003 solution = new LongestSubStringLength_0003();

    @Test
    public void getLengthByMap1() throws Exception {
        String str = "abcgj";
        Assert.assertEquals(solution.getLengthByMap(str), 5);
    }


    @Test
    public void getLengthByMap2() {
        String str = "abcabc";
        Assert.assertEquals(3, solution.getLengthByMap(str));
    }

    @Test
    public void getLengthByMap3() {
        String str = "aaabvaa";
        Assert.assertEquals(3, solution.getLengthByMap(str));
    }   


    @Test
    public void getLengthByMap4() {
        String str =  "aaaa";
        Assert.assertEquals(1, solution.getLengthByMap(str));
    }

    @Test
    public void getLength5ByMap() {
        String str = "abba";
        Assert.assertEquals(2, solution.getLengthByMap(str));
    }
}