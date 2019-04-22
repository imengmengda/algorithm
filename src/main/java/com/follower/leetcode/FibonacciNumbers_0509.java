package com.follower.leetcode;

/**
 * Created by lin on 19-4-21.
 */
public class FibonacciNumbers_0509 {

    public int fib(int N) {
        if (N <= 1) {
            return N;
        }
        int res = 0;
        int oneStep = 1;
        int twoStep = 0;
        for (int i = 1; i != N; i ++) {
            res = oneStep + twoStep;
            twoStep = oneStep;
            oneStep = res;
        }
        return res;
    }

}
