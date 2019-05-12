package com.follower.leetcode;

import com.follower.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lin on 19-5-12.
 */
public class BinaryTreeInorderTraversalRecurse_0094 extends BinaryTreeInorderTraversal_0094 {

    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderTraversalRecurse(res, root);
        return res;
    }

    private void inorderTraversalRecurse(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversalRecurse(list, root.left);
        list.add(root.val);
        inorderTraversalRecurse(list, root.right);
    }
}
