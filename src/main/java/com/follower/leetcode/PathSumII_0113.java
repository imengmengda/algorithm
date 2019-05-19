package com.follower.leetcode;

import com.follower.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lin on 19-5-20.
 */
public class PathSumII_0113 {



    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        if (root == null) {
            return new ArrayList<>();
        }
        if (root.left == null && root.right == null && root.val == sum) {
            List<Integer> resultList = new ArrayList<Integer>() {
                {add(root.val);}
            };
            List<List<Integer>> res = new ArrayList<>();
            res.add(resultList);
            return res;
        }
        List<List<Integer>> leftList = pathSum(root.left, sum - root.val);
        List<List<Integer>> rightList = pathSum(root.right, sum - root.val);
        List<List<Integer>> res = new ArrayList<>();

        for (List<Integer> leftItem : leftList) {
            if (!leftItem.isEmpty()) {
                leftItem.add(0,root.val);
                res.add(leftItem);
            }
        }

        for (List<Integer> rightItem : rightList) {
            if (!rightItem.isEmpty()) {
                rightItem.add(0,root.val);
                res.add(rightItem);
            }
        }

        return res;
    }
}
