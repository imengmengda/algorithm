package com.follower.common;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-5-11.
 */
public class PriorityQueueTest {

    @Test
    public void priorityQueueTest1() {
        Integer[] array = {7, 9, 0, -1, 2, 4, 12, 2, 2, 1, 8, 3};
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(array);
        System.out.println(Arrays.deepToString(array));
        /**
         *            12
         *         /      \
         *        9       7
         *      /  \     / \
         *     2   8    4  0
         *    / \ / \
         *   -1 2 1 2
         */
    }

    @Test
    public void priorityQueueTest2() {
        Integer[] array = {7, 9, 0, -1, 2, 4, 12, 2, 2, 1, 8, 3};
        PriorityQueue.heapSort(array);
        System.out.println(Arrays.deepToString(array));
    }

}