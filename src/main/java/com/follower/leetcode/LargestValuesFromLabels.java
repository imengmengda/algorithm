package com.follower.leetcode;

import java.util.*;

/**
 * Created by lin on 19-6-16.
 */
public class LargestValuesFromLabels {

    static class Item {

        int value;

        int label;

        Item(int value, int label) {
            this.value = value;
            this.label = label;
        }

        public int getValue() {
            return value;
        }

        public int getLabel() {
            return label;
        }
    }


    public int largestValsFromLabels(int[] values, int[] labels, int num_wanted, int use_limit) {
        if (values.length == 0 || num_wanted == 0 || use_limit == 0) {
            return 0;
        }

        int res = 0;
        Queue<Item> queue = new PriorityQueue<>(Comparator.comparingInt(Item::getValue).reversed());
        for (int i = 0; i < values.length; i ++) {
            queue.add(new Item(values[i], labels[i]));
        }

        Map<Integer,Integer> timesMap = new HashMap<>();
        int cnt = 0;

        while (cnt < num_wanted && !queue.isEmpty()) {
            Item item = queue.remove();
            if (timesMap.getOrDefault(item.getLabel(), 0) < use_limit) {
                res += item.getValue();
                cnt ++;
                timesMap.put(item.getLabel(), timesMap.getOrDefault(item.getLabel(), 0) + 1);
            }

        }

        return res;
    }
}
