package com.follower.leetcode;


import java.util.*;

/**
 * Created by lin on 19-5-12.
 */
public class TopKFrequentElements_0347 {

    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i: nums) {
            if (hashMap.containsKey(i)) {
                hashMap.put(i, hashMap.get(i) + 1);
            } else {
                hashMap.put(i, 1);
            }
        }
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());
        for (Map.Entry<Integer, Integer> entry: hashMap.entrySet()) {
            queue.add(entry);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i != k; i ++) {
            res.add(queue.remove().getKey());
        }
        return res;
    }
}
