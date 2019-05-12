package com.follower.common;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-5-12.
 */
public class QuickSortTest {

    QuickSort quickSort = new QuickSort();

    @Test
    public void quickSortTest1() throws Exception {
        int[] arraySrc = new int[]{0, -1, 2, 1, 2, 1, 77, 8, -9, 8, -9, 7, 7};
        quickSort.quickSort(arraySrc);
        System.out.println(Arrays.toString(arraySrc));
    }

    @Test
    public void quickSortTest2() {
        int[] array = {1, 2};
        quickSort.quickSort(array);
        System.out.println(Arrays.toString(array));
    }

}