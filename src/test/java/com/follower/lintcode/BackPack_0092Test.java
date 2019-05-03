package com.follower.lintcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-5-3.
 */
public class BackPack_0092Test {

    BackPack_0092 solution = new BackPack_0092();

    @Test
    public void backPack() throws Exception {
        Assert.assertEquals(9, solution.backPack(10, new int[]{3,4,8,5}));
    }

}