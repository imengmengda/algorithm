package com.follower.leetcode;

/**
 * Created by lin on 19-4-27.
 */
public class ContainerWithMostWater_0011 {

    public int maxArea(int[] height) {
        int res = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            if (height[left] > height[right]) {
                res = Math.max(height[right] * (right - left), res);
                right --;
            } else {
                res = Math.max(height[left] * (right - left), res);
                left ++;
            }
        }
        return res;
    }
}
