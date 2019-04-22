package com.follower.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-4-21.
 */
public class Add2Nums_0002Test {

    Add2Nums_0002 solution = new Add2Nums_0002();

    @Test
    public void addTwoNumbers() throws Exception {

        Add2Nums_0002.ListNode node1 = new Add2Nums_0002.ListNode(2);
        node1.next = new Add2Nums_0002.ListNode(4);
        node1.next.next = new Add2Nums_0002.ListNode(3);

        Add2Nums_0002.ListNode node2 = new Add2Nums_0002.ListNode(5);
        node2.next = new Add2Nums_0002.ListNode(6);
        node2.next.next = new Add2Nums_0002.ListNode(4);

        Add2Nums_0002.ListNode res = new Add2Nums_0002.ListNode(7);
        res.next = new Add2Nums_0002.ListNode(0);
        res.next.next = new Add2Nums_0002.ListNode(8);

        Add2Nums_0002.ListNode resT = solution.addTwoNumbers(node1, node2);
        while (resT.next != null) {
            System.out.println(resT.val);
            resT = resT.next;
        }

        Add2Nums_0002.ListNode real = solution.addTwoNumbers(node1, node2);
        while (res != null) {
            Assert.assertEquals(real.val,res.val);
            res = res.next;
            real = real.next;
        }
        Assert.assertNull(real);

    }

}