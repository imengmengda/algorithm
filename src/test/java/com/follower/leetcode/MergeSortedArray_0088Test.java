package com.follower.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-5-19.
 */
public class MergeSortedArray_0088Test {

    MergeSortedArray_0088 solution = new MergeSortedArray_0088();

    @Test
    public void mergeTest() throws Exception {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;
        solution.merge(nums1, m, nums2, n);
        System.out.println(nums1);
    }

}