package com.follower.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lin on 19-6-30.
 */
public class PathInZigZagTree_1104 {

    public List<Integer> pathInZigZagTree(int label) {
        int base = 2;
        boolean order = false;
        while (label >= base * 2) {
            base *= 2;
            order = !order;
        }
        List<Integer> res = new ArrayList<>();
        while (base >= 1) {
            res.add(0, label);
            if (label == 1) {
                break;
            }
            int index;
            if (!order) {
                index = (base * 2 - 1 - label) / 2;
                label = base / 2 + index;
            } else {
                index = (label - base) / 2;
                label = base - 1 - index;
            }
            base /= 2;
            order = !order;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new PathInZigZagTree_1104().pathInZigZagTree(16));
    }
}
