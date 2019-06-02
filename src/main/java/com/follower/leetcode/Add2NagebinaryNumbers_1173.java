package com.follower.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Created by lin on 19-6-2.
 */
public class Add2NagebinaryNumbers_1173 {

    public int[] addNegabinary(int[] arr1, int[] arr2) {
       Stack<Integer> stack = new Stack<>();
       int index1 = arr1.length - 1;
       int index2 = arr2.length - 1;
       int carrier = 0;
       while (index1 >= 0 || index2 >= 0 || carrier != 0) {
           if (index1 >= 0) {
               carrier += arr1[index1--];
           }
           if (index2 >= 0) {
               carrier += arr2[index2--];
           }
           stack.push(carrier & 1);
           carrier = -(carrier >> 1);
       }

       while (!stack.isEmpty()) {
           if (stack.peek() == 0) {
               stack.pop();
           } else {
               break;
           }
       }

       if (stack.isEmpty()) {
           return new int[]{0};
       }

       int[] res = new int[stack.size()];
       int cnt = 0;
       while (!stack.isEmpty()) {
           res[cnt++] = stack.pop();
       }
       return res;
    }
}
