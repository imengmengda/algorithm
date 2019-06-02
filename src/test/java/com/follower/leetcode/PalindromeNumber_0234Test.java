package com.follower.leetcode;

import com.follower.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-6-1.
 */
public class PalindromeNumber_0234Test {

    PalindromeNumber_0234 solution = new PalindromeNumber_0234();

    @Test
    public void isPalindrome() throws Exception {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.println(solution.isPalindrome(head));
    }

}