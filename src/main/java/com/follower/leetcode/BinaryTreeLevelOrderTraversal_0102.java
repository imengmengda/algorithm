package com.follower.leetcode;

import com.follower.common.TreeNode;

import java.util.*;

/**
 * Created by lin on 19-5-19.
 */
public class BinaryTreeLevelOrderTraversal_0102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();

        /**
         * 存放一行的结果
         */
        List<Integer> levelResult = new ArrayList<>();
        List<TreeNode> levelTreeNode = new ArrayList<>();

        if (root == null) {
            return res;
        }
        queue.add(root);
        res.add(
            new ArrayList<Integer>(){{add(root.val);}}
        );
        while (!queue.isEmpty()) {

            TreeNode temp = queue.remove();
            if (temp.left != null) {
                levelTreeNode.add(temp.left);
                levelResult.add(temp.left.val);
            }
            if (temp.right != null) {
                levelTreeNode.add(temp.right);
                levelResult.add(temp.right.val);
            }
            if (queue.isEmpty() && !levelResult.isEmpty()) {
                queue.addAll(levelTreeNode);
                List<Integer> tempLevelResult = new ArrayList<>(levelResult);
                res.add(tempLevelResult);
                levelResult.clear();
                levelTreeNode.clear();
            }
        }
        return res;
    }
}
