package com.follower.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lin on 19-5-19.
 */
public class AvlTree {

    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void insert(int val) {
        if (root == null) {
            root = new TreeNode(val);
            return;
        }
        root = insertRecurseHepler(root, val);
    }

    private TreeNode insertRecurseHepler(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val <= root.val) {
            root.left = insertRecurseHepler(root.left, val);
            if (height(root.left) - height(root.right) >= 2) {
                if (val <= root.left.val) {
                    root = llRonate(root);
                } else {
                    root = lrRonate(root);
                }
            }
        } else {
            root.right = insertRecurseHepler(root.right, val);
            if (height(root.right) - height(root.left) >= 2) {
                if (val > root.right.val) {
                    root = rrRonate(root);
                } else {
                    root = rlRonate(root);
                }
            }
        }
        return root;
    }

    private TreeNode llRonate(TreeNode root) {
        TreeNode newRoot = root.left;
        root.left = newRoot.right;
        newRoot.right = root;
        return newRoot;
    }

    private TreeNode lrRonate(TreeNode root) {
        root.left = rrRonate(root.left);
        return llRonate(root);
    }

    private TreeNode rrRonate(TreeNode root) {
        TreeNode newRoot = root.right;
        root.right = newRoot.left;
        newRoot.left = root;
        return newRoot;
    }

    private TreeNode rlRonate(TreeNode root) {
        root.right = llRonate(root.right);
        return rrRonate(root);
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

}
