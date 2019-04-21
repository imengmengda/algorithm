package com.follower.leetcode;

import java.util.List;

/**
 * Created by lin on 19-4-21.
 */
public class Add2Nums_0002 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode s1 = l1;
        ListNode s2 = l2;
        ListNode temp = new ListNode(0);
        ListNode res = temp;
        int sum = 0;

        while (s1 != null || s2 != null) {
            if (s1 != null) {
                sum += s1.val;
                s1 = s1.next;
            } if (s2 != null) {
                sum += s2.val;
                s2 = s2.next;
            }
            temp.val = sum % 10;
            sum /= 10;

            if (s1 != null || s2 != null) {
                temp.next = new ListNode(0);
                temp = temp.next;
            }
        }

        if (sum == 1) {
            temp.next = new ListNode(1);
        }

        return res;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
         val = x;
        }
    }

}
