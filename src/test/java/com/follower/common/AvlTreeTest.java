package com.follower.common;

import com.follower.leetcode.BinaryTreeInorderTraversalByRecurse_0094;
import com.follower.leetcode.BinaryTreeInorderTraversal_0094;
import com.follower.leetcode.BinaryTreePreorderTraversalRecurse_0144;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-5-19.
 */
public class AvlTreeTest {

    BinaryTreeInorderTraversal_0094 preorderTraversal = new BinaryTreeInorderTraversalByRecurse_0094();

    @Test
    public void avlTreeTest() {
        int[] arr = {5, 6, 77, 9, 4, -1, 0, 0, 7, -1, 2, 1, 1, 2};
        AvlTree tree = new AvlTree();
        for (int i :arr) {
            tree.insert(i);
            //System.out.println(preorderTraversal.inorderTraversal(tree.getRoot()));
        }
        Arrays.sort(arr);
        List<Integer> sortedList = new ArrayList<>();
        for (int i: arr) {
            sortedList.add(i);
        }
        Assert.assertEquals(preorderTraversal.inorderTraversal(tree.getRoot()),
                sortedList);
    }

}