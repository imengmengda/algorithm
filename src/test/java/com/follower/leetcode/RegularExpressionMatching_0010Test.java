package com.follower.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-4-23.
 */
public class RegularExpressionMatching_0010Test {

    RegularExpressionMatching_0010 solution = new RegularExpressionMatching_0010();

    @Test
    public void isMatch1() throws Exception {
        Assert.assertEquals(false, solution.isMatch("aa", "a"));
    }

    @Test
    public void isMatch2() throws Exception {
        Assert.assertEquals(true, solution.isMatch("aa", "a*"));
    }

    @Test
    public void isMatch3() throws Exception {
        Assert.assertEquals(true, solution.isMatch("ab", ".*"));
    }

    @Test
    public void isMatch4() throws Exception {
        Assert.assertEquals(false, solution.isMatch("mississippi", "mis*is*p*."));
    }

    @Test
    public void isMatch5() {
        Assert.assertEquals(true, solution.isMatch("mississippi", "mis*is*ip*."));
    }

    @Test
    public void isMatch6() {
        Assert.assertEquals(false, solution.isMatch("b", "a*"));
    }
}