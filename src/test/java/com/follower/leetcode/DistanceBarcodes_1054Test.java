package com.follower.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-5-26.
 */
public class DistanceBarcodes_1054Test {

    DistanceBarcodes_1054 solution = new DistanceBarcodes_1054();

    @Test
    public void rearrangeBarcodes() throws Exception {
        System.out.println(Arrays.toString(solution.rearrangeBarcodes(new int[]{1, 1, 1,  2, 2, 2})));
    }

}