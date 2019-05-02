package com.follower.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-5-2.
 */
public class ReverseLinkedList_0206Test {

    ReverseLinkedList_0206 solution = new ReverseLinkedList_0206();

    @Test
    public void reverseList1() throws Exception {
        ReverseLinkedList_0206.ListNode head = new ReverseLinkedList_0206.ListNode(1);
        ReverseLinkedList_0206.ListNode headTemp = head;
        for (int i = 2; i != 6; i++) {
            ReverseLinkedList_0206.ListNode next = new ReverseLinkedList_0206.ListNode(i);
            headTemp.next = next;
            headTemp = next;
        }
        headTemp = head;
        while (headTemp != null) {
            System.out.println(headTemp.val);
            headTemp = headTemp.next;
        }
        ReverseLinkedList_0206.ListNode node = solution.reverseList(head);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    @Test
    public void reverseList2() throws Exception {
        ReverseLinkedList_0206.ListNode head = new ReverseLinkedList_0206.ListNode(1);
        ReverseLinkedList_0206.ListNode headTemp = head;
        for (int i = 2; i != 6; i++) {
            ReverseLinkedList_0206.ListNode next = new ReverseLinkedList_0206.ListNode(i);
            headTemp.next = next;
            headTemp = next;
        }
        headTemp = head;
        while (headTemp != null) {
            System.out.println(headTemp.val);
            headTemp = headTemp.next;
        }
        ReverseLinkedList_0206.ListNode node = solution.reverseListByRecurse(head);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}