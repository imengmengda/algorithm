package com.follower.leetcode;

/**
 * Created by lin on 19-4-21.
 */
public class ClimbStairs_0070 {

    public int climbStairsByRecursion(int n) {
        //out of time
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return climbStairsByRecursion(n - 1) + climbStairsByRecursion(n - 2);
        }
    }

    public int climbStairs(int n) {
        int res = 0;
        int oneStep = 2;
        int twoStep = 1;
        if (n <= 2) {
            return n;
        }
        for (int i = 2; i != n; i++) {
            res = oneStep + twoStep;
            twoStep = oneStep;
            oneStep = res;
        }
        return res;
    }

}
