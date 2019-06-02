package com.follower.leetcode;

import java.util.Arrays;

/**
 * Created by lin on 19-6-2.
 */
public class ThreeSumClosest_0016 {

    public int threeSumClosest(int[] nums, int target) {
        int res = 0;

        if (nums.length < 3) {
            for (int i: nums) {
                res += i;
            }
            return res;
        }

        res = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i ++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int leftIndex = i + 1;
            int rightIndex = nums.length - 1;
            while (leftIndex < rightIndex) {
                int sum = nums[leftIndex] + nums[rightIndex] + nums[i];
                if (Math.abs(sum - target) < Math.abs(res - target)) {
                    res = sum;
                }
                if (sum == target) {
                    return target;
                } else if (sum < target) {
                    do {
                        leftIndex++;
                    } while (leftIndex < rightIndex && nums[leftIndex] == nums[leftIndex - 1]);
                } else {
                    do {
                        rightIndex--;
                    } while (leftIndex < rightIndex && nums[rightIndex] > nums[rightIndex + 1]);
                }
            }

        }
        return res;
    }

}
