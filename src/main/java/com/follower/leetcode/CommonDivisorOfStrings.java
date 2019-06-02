package com.follower.leetcode;

/**
 * Created by lin on 19-6-2.
 */
public class CommonDivisorOfStrings {

    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() == 0 || str2.length() == 0) {
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());
        if (checkGcdString(str1, str1.substring(0, gcdLength)) && checkGcdString(str2, str1.substring(0, gcdLength))) {
            return str1.substring(0, gcdLength);
        } else {
            return "";
        }
    }

    public int gcd(int x, int y) {
        return x % y == 0? y: gcd(y, x % y);
    }

    public boolean checkGcdString(String src, String base) {
        if (src.length() % base.length() != 0) {
            return false;
        }
        int index = 0;
        while (index < src.length()) {
            if (!src.substring(index, index + base.length()).equals(base)) {
                return false;
            }
            index += base.length();
        }
        return true;
    }
}
