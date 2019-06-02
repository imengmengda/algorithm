package com.follower.leetcode;

//import jdk.internal.util.xml.impl.Pair;

import javafx.print.PageOrientation;
import jdk.internal.util.xml.impl.Pair;

import java.util.*;

/**
 * Created by lin on 19-6-1.
 */
public class FourSum_0018 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 4) {
            return res;
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i ++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            List<Integer> list = new ArrayList<>();
            for (int j = i + 1; j < nums.length; j ++) {
                list.add(nums[j]);
            }
            List<List<Integer>> resItem = thressSum(list, target - nums[i], nums[i]);
            res.addAll(resItem);
        }
        return res;

    }

    public List<List<Integer>> thressSum(List<Integer> list, int target, int j) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i ++) {
            if (i > 0 && list.get(i).equals(list.get(i - 1))) {
                continue;
            }
            int leftIndex = i + 1;
            int rightIndex = list.size() - 1;
            while (leftIndex < rightIndex) {
                if (list.get(leftIndex) + list.get(rightIndex) == target - list.get(i)) {
                    List<Integer> resItem = new ArrayList<>();
                    resItem.add(list.get(leftIndex));
                    resItem.add(list.get(rightIndex));
                    resItem.add(list.get(i));
                    resItem.add(j);
                    res.add(resItem);
                    do {
                        leftIndex++;
                    } while (leftIndex < rightIndex && list.get(leftIndex).equals(list.get(leftIndex - 1)));

                    do {
                        rightIndex--;
                    } while (leftIndex < rightIndex && list.get(rightIndex).equals(list.get(rightIndex + 1)));
                }

                while (leftIndex < rightIndex && list.get(leftIndex) + list.get(rightIndex) > target - list.get(i)) {
                    rightIndex--;
                }
                while (leftIndex < rightIndex && list.get(leftIndex) + list.get(rightIndex) < target - list.get(i)) {
                    leftIndex++;
                }
            }

        }
        return res;
    }

}
