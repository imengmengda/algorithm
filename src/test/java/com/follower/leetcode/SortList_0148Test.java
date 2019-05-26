package com.follower.leetcode;

import com.follower.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-5-19.
 */
public class SortList_0148Test {

    SortList_0148 solution = new SortList_0148();

    @Test
    public void sortList() throws Exception {
        ListNode head = new ListNode(-1);
        head.next = new ListNode(5);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(0);
        //head = solution.sortList(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

}