package com.follower.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lin on 19-4-21.
 */
public class TwoSum_0001 {

    public int[] twoSum(int[] nums, int target) {
        int[] res = {-1, -1};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i != nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[1] = i;
                res[0] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);
        }
        return res;
    }

}
