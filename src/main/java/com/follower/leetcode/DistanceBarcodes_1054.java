package com.follower.leetcode;


import java.util.*;

/**
 * Created by lin on 19-5-26.
 */
public class DistanceBarcodes_1054 {

    public int[] rearrangeBarcodes(int[] barcodes) {
        PriorityQueue<Item> queue = new PriorityQueue<Item>(
                new Comparator<Item>() {
                    @Override
                    public int compare(Item o1, Item o2) {
                        return o2.val - o1.val
;                    }
                }
        );
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i :barcodes) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry: hashMap.entrySet()) {
            queue.add(new Item(entry.getKey(),entry.getValue()));
        }
        int[] res = new int[barcodes.length];
        int index = 0;
        while (!queue.isEmpty()) {
            Item firstItem = queue.remove();
            res[index++] = firstItem.key;
            firstItem.val --;
            Item secondItem = null;
            if (!queue.isEmpty()) {
                secondItem = queue.remove();
                res[index++] = secondItem.key;
                secondItem.val --;

            }

            if (firstItem.val != 0) {
                queue.add(firstItem);
            }
            if (secondItem != null && secondItem.val != 0) {
                queue.add(secondItem);
            }

        }

        return res;
    }

    class Item {

        int val;

        int key;

        Item(int key, int val) {
            this.val = val;
            this.key = key;
        }

    }


}
