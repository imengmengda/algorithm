package com.follower.leetcode;


import com.follower.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lin on 19-5-12.
 */
public class BinaryTreePreorderTraversalRecurse_0144 extends BinaryTreePreorderTraversal_0144{

    @Override
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preOrderRecurse(res, root);
        return res;
    }

    public void preOrderRecurse(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        preOrderRecurse(list, root.left);
        preOrderRecurse(list, root.right);
    }
}
