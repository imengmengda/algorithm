package com.follower.leetcode;

import com.follower.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by lin on 19-5-20.
 */
public class BinaryTreeLevelOrderTraversalII_0107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        List<Integer> levelResult = new ArrayList<>();
        List<TreeNode> levelNodes = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            levelResult.add(node.val);
            if (node.left != null) {
                levelNodes.add(node.left);
            }
            if (node.right != null) {
                levelNodes.add(node.right);
            }
            if (queue.isEmpty()) {
                if (!levelResult.isEmpty()) {
                    List<Integer> tempLevelResult = new ArrayList<>(levelResult);
                    res.add(0, tempLevelResult);
                    levelResult.clear();
                }
                if (!levelNodes.isEmpty()) {
                    queue.addAll(levelNodes);
                    levelNodes.clear();
                }
            }
        }
        return res;
    }

}
