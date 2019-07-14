package com.follower.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-6-16.
 */
public class LargestValuesFromLabelsTest {

    LargestValuesFromLabels solution = new LargestValuesFromLabels();

    @Test
    public void largestValsFromLabels() throws Exception {
        System.out.println(solution.largestValsFromLabels(
                new int[]{5,4,3,2,1},
                new int[]{1,3,3,3,2},
        3,
        2));
    }

}