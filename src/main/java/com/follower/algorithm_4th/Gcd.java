package com.follower.algorithm_4th;

/**
 * Created by lin on 18-5-24.
 */
public class Gcd {
    //greatest common divisor of two nonnegative integers
    public static int gcd(int a, int b){
        //Euclidean algorithm
        if (a < b) {
            if (a == 0) {
                return b;
            }
            int r = b % a;
            return gcd(a, r);
        } else {
            return gcd(b, a);
        }
    }
}