package com.follower.leetcode;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by lin on 19-6-23.
 */
public class Sample_1093 {

    public double[] sampleStats(int[] count) {
        double[] res = new double[5];
        if (count == null || count.length == 0) {
            return res;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        long sum = 0;
        int size = 0;
        int largestTime = 0;
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < count.length; i ++) {
            map.put(i, count[i]);
            if (i > max && count[i] > 0) {
                max = i;
            }
            if (i < min && count[i] > 0) {
                min = i;
            }
            if (count[i] > largestTime) {
                res[4] = i;
                largestTime = count[i];
            }
            sum += i * count[i];
            size += count[i];
        }


        res[0] = min;
        res[1] = max;
        res[2] = new Double(sum) / size;

        List<Integer> sortedKeys = new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys);
        if (size % 2 == 0) {
            int index1 = size / 2;
            int index2 = size / 2 + 1;
            int num1 = -1;
            int num2 = -1;
            for (int i: sortedKeys) {
                index1 -= map.get(i);
                index2 -= map.get(i);
                if (index1 <= 0 && num1 == -1) {
                    num1 = i;
                }
                if (index2 <= 0 && num2 == -1) {
                    num2 = i;
                }
                if (index1 <= 0 && index2 <= 0) {
                    break;
                }
            }
            res[3] = (num1 + num2) / 2.0;
        } else {
            int index = size / 2 + 1;
            for (int i: sortedKeys) {
                index -= map.get(i);
                if (index <= 0) {
                    res[3] = i;
                    break;
                }
            }
        }

        return res;
    }
}
