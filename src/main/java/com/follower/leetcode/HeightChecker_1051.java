package com.follower.leetcode;

import java.util.Arrays;

/**
 * Created by lin on 19-5-26.
 */
public class HeightChecker_1051 {

    public int heightChecker(int[] heights) {
        int[] heightsTemp = heights.clone();
        Arrays.sort(heightsTemp);
        int res = 0;
        for (int i = 0; i != heights.length; i ++) {
            if (heights[i] != heightsTemp[i]) {
                res ++;
            }
        }
        return res;
    }
}
