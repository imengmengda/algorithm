package com.follower.leetcode;

import com.follower.common.ListNode;

/**
 * Created by lin on 19-6-1.
 */
public class PalindromeNumber_0234 {

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head.next;
        ListNode fast = head.next;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode temp = new ListNode(0);
        reverseList(slow, temp);

        ListNode half = temp.next;
        while (head != slow && half != slow) {
            if (head.val != half.val) {
                return false;
            }
            head = head.next;
            half = half.next;
        }
        return head == slow || head.val == slow.val;
    }

    public ListNode reverseList(ListNode node, ListNode head) {
        if (node.next == null) {
            head.next = node;
            return node;
        } else {
            ListNode res = reverseList(node.next, head);
            res.next = node;
            return node;
        }
    }

}
