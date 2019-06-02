package com.follower.leetcode;

/**
 * Created by lin on 19-6-2.
 */
public class SingleNumberII_037 {

    public int singleNumber(int[] nums) {
        int[] bitSum = new int[32];
        for (int i: nums) {
            for (int j = 0; j != bitSum.length; j ++) {
                bitSum[j] += (i >> j) & 1;
            }
        }
        int res = 0;
        for (int i = 0, base = 1; i < bitSum.length; i ++, base *= 2) {
            bitSum[i] %= 3;
            res += bitSum[i] * base;
        }
        return res;

    }

}
