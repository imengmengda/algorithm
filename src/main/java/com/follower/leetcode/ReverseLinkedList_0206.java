package com.follower.leetcode;

/**
 * Created by lin on 19-5-2.
 */
public class ReverseLinkedList_0206 {

    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head) {
        ListNode firstNode = null;
        ListNode secondNode = null;
        while (head != null) {
            firstNode = new ListNode(head.val);
            firstNode.next = secondNode;
            secondNode = firstNode;
            head = head.next;
        }
        return firstNode;
    }

    public ListNode reverseListByRecurseHelper(ListNode head, ListNode res) {
        if (head.next != null) {
            ListNode node = reverseListByRecurseHelper(head.next, res);
            node.next = head;
            head.next = null;
            return head;
        }
        res.next = new ListNode(head.val);
        return res.next;
    }

    public ListNode reverseListByRecurse(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode resHolder = new ListNode(0);
        reverseListByRecurseHelper(head, resHolder);
        return resHolder.next;
    }
}
