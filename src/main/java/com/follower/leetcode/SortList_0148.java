package com.follower.leetcode;

import com.follower.common.ListNode;

/**
 * Created by lin on 19-5-19.
 */
public class SortList_0148 {

    public ListNode sortList(ListNode head) {
        return recurseHelper(head, null);
    }

    public ListNode recurseHelper(ListNode head, ListNode tail) {
        if (head.next == tail) {
            return new ListNode(head.val);
        }

        ListNode slow = head.next;
        ListNode fast = head.next;
        while (fast != tail && fast.next != tail) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode mid = slow;

        ListNode firstRes = recurseHelper(head, mid);
        ListNode secondRes = recurseHelper(mid, tail);


        ListNode res = new ListNode(0);
        ListNode resTemp = res;
        ListNode first = firstRes;
        ListNode second = secondRes;

        while (first != null || second != null) {
            while (first != null && (second == null || first.val < second.val)) {
                resTemp.next = new ListNode(first.val);
                resTemp = resTemp.next;
                first = first.next;
            }
            while (second != null && (first == null || first.val >= second.val)) {
                resTemp.next = new ListNode(second.val);
                resTemp = resTemp.next;
                second = second.next;
            }
        }
        return res.next;
    }
}
