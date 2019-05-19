package com.follower.leetcode;

import com.follower.common.ListNode;

/**
 * Created by lin on 19-5-19.
 */
public class MergeSortedLists_0021 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode resTemp = new ListNode(0);
        ListNode res = resTemp;
        while (l1 != null || l2 != null) {
            while ((l2 != null) && (l1 == null || l1.val > l2.val)) {
                resTemp.next = new ListNode(l2.val);
                resTemp = resTemp.next;
                l2 = l2.next;
            }
            while ((l1 != null) && (l2 == null || l1.val <= l2.val)) {
                resTemp.next = new ListNode(l1.val);
                resTemp = resTemp.next;
                l1 = l1.next;
            }
        }
        return res.next;
    }

}
