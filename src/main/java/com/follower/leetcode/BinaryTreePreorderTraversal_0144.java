package com.follower.leetcode;

import com.follower.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lin on 19-5-12.
 */
public class BinaryTreePreorderTraversal_0144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<TreeNode> treeNodes = new Stack<>();
        TreeNode currentNode = null;
        treeNodes.push(root);
        while (!treeNodes.isEmpty()) {
            currentNode = treeNodes.pop();
            res.add(currentNode.val);
            if (currentNode.right != null) {
                treeNodes.push(currentNode.right);
            }
            if (currentNode.left != null) {
                treeNodes.push(currentNode.left);
            }
        }
        return res;
    }
}
