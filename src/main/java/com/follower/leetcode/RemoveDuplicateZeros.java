package com.follower.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lin on 19-6-16.
 */
public class RemoveDuplicateZeros {

    public void duplicateZeros(int[] arr) {
        List<Integer> stack = new ArrayList<>();
        for (int i = 0; i <= arr.length; i ++) {
            if (stack.size() >= arr.length) {
                break;
            }
            stack.add(arr[i]);
            if (arr[i] == 0) {
                stack.add(0);
            }
        }
        int index = arr.length - 1;
        while (!stack.isEmpty()) {
            arr[index--] = stack.remove(0);
        }
    }
}
