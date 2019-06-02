package com.follower.leetcode;

import com.follower.common.ListNode;


import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by lin on 19-6-1.
 */
public class MergeKSortedLists_0008 {

    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));
        for (ListNode node: lists) {
            if (node != null) {
                queue.add(node);
            }
        }
        ListNode res = new ListNode(0);
        ListNode resSrc = res;

        while (!queue.isEmpty()) {
            res.next = queue.remove();
            res = res.next;
            if (res.next != null) {
                queue.add(res.next);
            }
        }
        return resSrc.next;
    }
}
