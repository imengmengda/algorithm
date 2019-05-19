package com.follower.leetcode;

import com.follower.common.ListNode;

/**
 * Created by lin on 19-5-19.
 */
public class MergeSortedListsByRecurse_0021 extends MergeSortedLists_0021 {

    @Override
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val > l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
