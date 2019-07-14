package com.follower.leetcode;

import java.util.Arrays;

/**
 * Created by lin on 19-7-14.
 */
public class RelativeSortArray {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int index = 0;
        for (int i = 0; i < arr2.length; i ++) {
            for (int j = 0; j < arr1.length; j ++) {
                if (arr1[j] == arr2[i]) {
                    int temp = arr1[index];
                    arr1[index++] = arr2[i];
                    arr1[j] = temp;
                }

            }
        }
        if (index < arr1.length) {
            Arrays.sort(arr1, index, arr1.length);
        }
        return arr1;
    }

    public static void main(String[] args) {
        RelativeSortArray solution = new RelativeSortArray();
        System.out.println(Arrays.toString(solution.relativeSortArray(new int[]{28,6,22,8,44,17},
            new int[]{22,28,8,6})));
    }
}
