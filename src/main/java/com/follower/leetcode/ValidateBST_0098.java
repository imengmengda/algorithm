package com.follower.leetcode;

import com.follower.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lin on 19-5-19.
 */
public class ValidateBST_0098 {


    public boolean isValidBST(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        return recurseHelper(root, values);
    }

    private boolean recurseHelper(TreeNode root, List<Integer> list) {
        if (root == null) {
            return true;
        }
        if (!recurseHelper(root.left, list)) {
            return false;
        }
        if (list.size() > 0 && root.val <= list.get(list.size() - 1)) {
            return false;
        } else {
            list.add(root.val);
        }
        if (!recurseHelper(root.right, list)) {
            return false;
        }
        return true;
    }
}
