package com.follower.lintcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by lin on 19-5-4.
 */
public class LongestCommonPrefix_0078 {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String compareStr = getShortestString(strs);
        for (String s: strs) {
            compareStr = compare2Str(compareStr, s);
        }
        return compareStr;
    }

    public String getShortestString(String[] strs) {
        return Arrays.stream(strs).sorted(Comparator.comparingInt(String::length)).findFirst().get();
    }

    private String compare2Str(String str1, String str2) {
        /**
         * str1 is the shorter one
         */
        int length = str1.length();
        for (int i = 0; i != length; i ++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.substring(0, i);
            }
        }
        return str1.substring(0, length);
    }

}
