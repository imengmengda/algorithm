package com.follower.leetcode;

/**
 * Created by lin on 19-6-1.
 */
public class SingleNumber_0136 {

    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i: nums) {
            res ^= i;
        }
        return res;
    }
}
