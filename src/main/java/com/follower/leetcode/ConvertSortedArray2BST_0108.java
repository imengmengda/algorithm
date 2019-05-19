package com.follower.leetcode;

import com.follower.common.TreeNode;

/**
 * Created by lin on 19-5-19.
 */
public class ConvertSortedArray2BST_0108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return recurseHelper(nums, 0, nums.length - 1);
    }

    private TreeNode recurseHelper(int[] nums, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            return new TreeNode(nums[startIndex]);
        }
        int midIndex = startIndex + (endIndex - startIndex) / 2;
        TreeNode root = new TreeNode(nums[midIndex]);
        if (midIndex > startIndex) {
            root.left = recurseHelper(nums, startIndex, midIndex - 1);
        }
        root.right = recurseHelper(nums, midIndex + 1, endIndex);
        return root;
    }
}
