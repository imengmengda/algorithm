package com.follower.leetcode;

import com.follower.common.ListNode;
import com.follower.common.TreeNode;

/**
 * Created by lin on 19-5-19.
 */
public class ConvertSortedList2BST_0109 {

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        return recurseHelper(head, null);
    }

    private TreeNode recurseHelper(ListNode head, ListNode tail) {
        if (head == tail) {
            return null;
        }
        if (head.next == tail) {
            return new TreeNode(head.val);
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != tail && fast.next.next != tail) {
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode root = new TreeNode(slow.val);
        root.left = recurseHelper(head, slow);
        root.right = recurseHelper(slow.next, tail);
        return root;
    }
}
