package com.follower.leetcode;

import com.follower.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lin on 19-5-12.
 */
public class BinaryTreePostorderTraversal_0145 {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<TreeNode> treeNodes = new Stack<>();
        TreeNode currentNode = null;
        treeNodes.push(root);
        while (!treeNodes.isEmpty()) {
            currentNode = treeNodes.peek();
            if (currentNode.left == null && currentNode.right == null) {
                currentNode = treeNodes.pop();
                res.add(currentNode.val);
            }
            if (currentNode.right != null) {
                treeNodes.push(currentNode.right);
                currentNode.right = null;
            }
            if (currentNode.left != null) {
                treeNodes.push(currentNode.left);
                currentNode.left = null;
            }
        }
        return res;
    }
}
