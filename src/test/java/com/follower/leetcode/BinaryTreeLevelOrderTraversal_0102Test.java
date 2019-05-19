package com.follower.leetcode;

import com.follower.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-5-19.
 */
public class BinaryTreeLevelOrderTraversal_0102Test {

    BinaryTreeLevelOrderTraversal_0102 solution = new BinaryTreeLevelOrderTraversal_0102();

    @Test
    public void levelOrderTest() throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(solution.levelOrder(root));
    }

}