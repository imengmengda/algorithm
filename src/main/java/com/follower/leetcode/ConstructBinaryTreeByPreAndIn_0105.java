package com.follower.leetcode;

import com.follower.common.TreeNode;

import java.util.Arrays;

/**
 * Created by lin on 19-5-15.
 */
public class ConstructBinaryTreeByPreAndIn_0105 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return constructHepler(0, preorder.length - 1, 0, preorder, inorder);
    }

    public TreeNode constructHepler(int start, int end, int offset, int[] preOrder, int[] inOrder) {
        if (start >  end) {
            return null;
        }
        TreeNode rootNode = new TreeNode(preOrder[start + offset]);
        int index = getIndex(inOrder, preOrder[start + offset]);
        rootNode.left = constructHepler(start, index - 1, offset + 1, preOrder, inOrder);
        rootNode.right = constructHepler(index + 1, end, offset, preOrder, inOrder);
        return rootNode;
    }

    private int getIndex(int[] nums, int value) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        for (int i = 0; i != nums.length; i ++) {
            if (nums[i] == value) {
                return i;
            }
        }
        return -1;
    }

}
