package com.follower.leetcode;

import com.follower.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lin on 19-5-12.
 */
public class BinaryTreeInorderTraversal_0094 {

    /**
     * 元素可能重复入栈的，那第一次入栈后记得解决掉父子节点关系
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<TreeNode> treeNodes = new Stack<>();
        treeNodes.push(root);
        TreeNode currentNode = null;

        while (!treeNodes.isEmpty()) {
            currentNode = treeNodes.pop();
            if (currentNode.right != null) {
                treeNodes.push(currentNode.right);
                currentNode.right = null;
            }
            if (currentNode.left == null) {
                res.add(currentNode.val);
            } else {
                treeNodes.push(currentNode);
                treeNodes.push(currentNode.left);
                currentNode.left = null;
            }
        }
        return res;
    }
}
