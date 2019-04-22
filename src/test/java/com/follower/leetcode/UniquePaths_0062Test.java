package com.follower.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-4-23.
 */
public class UniquePaths_0062Test {

    UniquePaths_0062 solution = new UniquePaths_0062();

    @Test
    public void uniquePaths() throws Exception {
        Assert.assertEquals(28, solution.uniquePaths(7, 3));
    }

}