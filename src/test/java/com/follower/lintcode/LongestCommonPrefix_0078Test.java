package com.follower.lintcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-5-4.
 */
public class LongestCommonPrefix_0078Test {

    LongestCommonPrefix_0078 solution = new LongestCommonPrefix_0078();

    @Test
    public void longestCommonPrefix() throws Exception {
        Assert.assertEquals("A", solution.longestCommonPrefix(new String[]{
                "ABCD","ABEF","ACEFK"
        }));
    }

}