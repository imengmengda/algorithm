package com.follower.leetcode;

import com.follower.common.TreeNode;

import java.util.*;

/**
 * Created by lin on 19-5-19.
 */
public class BinaryTreeZigzagLevelOrderTraversal_0103 extends BinaryTreeLevelOrderTraversalByRecurse_0102{

    @Override
    public void recurseHelper(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() <= level) {
            List<Integer> newLine = new LinkedList<>();
            res.add(newLine);
        }
        if (level % 2 == 0) {
            res.get(level).add(root.val);
        } else {
            res.get(level).add(0, root.val);
        }
        recurseHelper(root.left, level + 1, res);
        recurseHelper(root.right, level + 1, res);
    }
}
