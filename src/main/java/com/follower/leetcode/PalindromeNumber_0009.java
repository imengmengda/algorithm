package com.follower.leetcode;

/**
 * Created by lin on 19-6-1.
 */
public class PalindromeNumber_0009 {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long index = 10;
        while (x >= index) {
            index *= 10;
        }

        return recurseHelper(x, index);
    }

    public boolean recurseHelper(long x, long index) {

        if (x >= 0 && x < 10 && index <= 10) {
            return true;
        }
        long firstNum = x % 10;
        index /= 10;
        long lastNum = (long)x / index;
        if (firstNum != lastNum) {
            return false;
        } else {
            return recurseHelper((x % index - lastNum) / 10, index / 10);
        }

    }

}
