package com.follower.leetcode;

import com.follower.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lin on 19-5-12.
 */
public class BinaryTreePostorderTraversalRecurse_0145 extends BinaryTreePostorderTraversal_0145 {

    @Override
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postOrderRecurse(res, root);
        return res;
    }

    public void postOrderRecurse(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        postOrderRecurse(list, root.left);
        postOrderRecurse(list, root.right);
        list.add(root.val);
    }
}
