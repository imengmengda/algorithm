package com.follower.leetcode;

import com.follower.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lin on 19-5-19.
 */
public class BinaryTreeInorderTraversalByRecurse_0094 extends BinaryTreeInorderTraversal_0094 {

    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        recurseHepler(res, root);
        return res;
    }

    private void recurseHepler(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        recurseHepler(list, root.left);
        list.add(root.val);
        recurseHepler(list, root.right);
    }
}
