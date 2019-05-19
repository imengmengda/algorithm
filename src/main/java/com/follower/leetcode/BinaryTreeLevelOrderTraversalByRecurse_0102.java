package com.follower.leetcode;

import com.follower.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by lin on 19-5-19.
 */
public class BinaryTreeLevelOrderTraversalByRecurse_0102 extends BinaryTreeLevelOrderTraversal_0102 {

    @Override
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        recurseHelper(root, 0, res);
        return res;
    }

    public void recurseHelper(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() <= level) {
            List<Integer> newLine = new LinkedList<>();
            res.add(newLine);
        }
        res.get(level).add(root.val);
        recurseHelper(root.left, level + 1, res);
        recurseHelper(root.right, level + 1, res);
    }
}
