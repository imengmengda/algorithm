package com.follower.leetcode;

import com.follower.common.TreeNode;

/**
 * Created by lin on 19-5-20.
 */
public class PathSum_0112 {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && root.val == sum) {
            return true;
        }
        return (root.left != null && hasPathSum(root.left, sum - root.val)) ||
                (root.right != null && hasPathSum(root.right, sum - root.val));

    }

}
