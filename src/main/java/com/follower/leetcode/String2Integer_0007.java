package com.follower.leetcode;

import jdk.internal.util.xml.impl.Pair;

/**
 * Created by lin on 19-6-1.
 */
public class String2Integer_0007 {

    public int myAtoi(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);

        for (int i = 0; i != stringBuilder.length(); i ++) {
            if (stringBuilder.charAt(i) != ' ') {
                stringBuilder.delete(0, i);
                break;
            }
        }

        for (int i = stringBuilder.length() - 1; i >= 0; i --) {
            if (stringBuilder.charAt(i) >= '0' && stringBuilder.charAt(i) <= '9') {
                stringBuilder.delete(i + 1, stringBuilder.length());
                break;
            }
        }

        boolean sig = true;
        if (stringBuilder.length() == 0) {
            return 0;
        } else {
            char c = stringBuilder.charAt(0);
            if (c == '-') {
                sig = false;
                stringBuilder.deleteCharAt(0);
            } else if (c == '+') {
                stringBuilder.deleteCharAt(0);
            } else if (!(c >= '0' && c <='9')) {
                return 0;
            }
        }

        int zeroIndex = 0;
        for (int i = 0; i < stringBuilder.length(); i ++, zeroIndex ++) {
            if (stringBuilder.charAt(i) != '0') {
                break;
            }
        }

        if (zeroIndex > 0) {
            stringBuilder.delete(0, zeroIndex);
        }

        for(int i = 0; i < stringBuilder.length(); i ++) {
            if (!(stringBuilder.charAt(i) >= '0' && stringBuilder.charAt(i) <= '9')) {
                stringBuilder.delete(i, stringBuilder.length());
                break;
            }
        }

        int index = 1;
        Long sum = 0l;
        int largestIndex = 10;
        while (Integer.MAX_VALUE / largestIndex > 1) {
            largestIndex *= 10;
        }

        for (int i = stringBuilder.length() - 1; i >= 0; i --, index *= 10) {
            if (!(stringBuilder.charAt(i) >= '0' && stringBuilder.charAt(i) <= '9')) {
                return 0;
            }
            sum += Long.valueOf(stringBuilder.substring(i, i + 1)) * index;
            if ((index >= largestIndex || sum >= Integer.MAX_VALUE) && sig) {
                return Integer.MAX_VALUE;
            } else if ((index >= largestIndex || sum >= (0l - (long) Integer.MIN_VALUE)) && !sig) {
                return Integer.MIN_VALUE;
            }
        }

        return sig?sum.intValue():0 - sum.intValue();
    }

}
