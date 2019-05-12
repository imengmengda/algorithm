package com.follower.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-5-12.
 */
public class KthLargestElementInAnArray_0215Test {

    KthLargestElementInAnArray_0215 solution = new KthLargestElementInAnArrayInHeap_0215();

    @Test
    public void findKthLargestTest1() throws Exception {
        Assert.assertEquals(-1, solution.findKthLargest(new int[]{-1, -1}, 2));
    }

    @Test
    public void findKthLargestTest2() throws Exception {
        Assert.assertEquals(5, solution.findKthLargest(new int[]{3,2,1,5,6,4}, 2));
    }


    @Test
    public void findKthLargestTest3() throws Exception {
        Assert.assertEquals(4,  solution.findKthLargest(new int[]{ 5,2,4,1,3,6,0}, 3));
    }

    @Test
    public void findKthLargestTest4() throws Exception {
        int[] a = {0, 2, 4, 1, 3, 5, 6};
        System.out.println(solution.partition(a, 1, 5));
        System.out.println(Arrays.toString(a));
    }
}