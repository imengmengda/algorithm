package com.follower.leetcode;

import com.follower.common.TreeNode;

/**
 * Created by lin on 19-5-15.
 */
public class ConstructBinaryTreeByInAndPost {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return constructHepler(inorder.length - 1, 0, 0, inorder, postorder);
    }

    public TreeNode constructHepler(int start, int end, int offset, int[] inorder, int[] postorder) {
        if (start < end) {
            return null;
        }
        TreeNode rootNode = new TreeNode(postorder[start + offset]);
        int index = getIndex(inorder, rootNode.val);
        rootNode.right = constructHepler(start, index + 1, offset - 1, inorder, postorder);
        rootNode.left = constructHepler(index - 1, end, offset, inorder, postorder);
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
