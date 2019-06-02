package com.follower.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by lin on 19-6-2.
 */
public class Add2NagebinaryNumbers_1173Test {

    Add2NagebinaryNumbers_1173 solution = new Add2NagebinaryNumbers_1173();

    @Test
    public void addNegabinary() throws Exception {
        System.out.println(Arrays.toString(solution.addNegabinary(
            new int[]{1,1,1,1,1},
            new int[]{1,0,1}
        )));
    }

}